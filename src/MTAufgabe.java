public class MTAufgabe {
    private static final int ARRAY_SIZE = 50_000_000;
    private static final int NUM_WORKERS = 8;

    public static void main(String[] args) {
        int[] int_array = new int[ ARRAY_SIZE ];

        // mit zufälligen Werten befüllen
        for (int i = 0; i < int_array.length; i++) {
            int_array[i] = (int)(Math.random() * 100);
        }

        long zeit = System.nanoTime();
        // Aufgabe
        long summe = 0;
        for (int element : int_array) summe += element;
        System.out.println("Summenwert des Arrays: " + summe);
        zeit = (System.nanoTime() - zeit) / 1000;
        System.out.println("Berechnet in " + zeit + "µs");

        // Gleiche Aufgabe, jetzt mit mehreren Threads
        zeit = System.nanoTime();
        SummenWorker[] worker = new SummenWorker[ NUM_WORKERS ];
        int start = 0;
        int elementeProThread = ARRAY_SIZE / NUM_WORKERS;
        for (int i=0; i<NUM_WORKERS; i++) {
            worker[i] = new SummenWorker(int_array, start, start+elementeProThread);
            worker[i].start();
            start += elementeProThread;
        }

        summe = 0;
        for (SummenWorker w : worker) {
            try { w.join(); }
            catch (InterruptedException ignored) {}
            summe += w.getErgebnis();
        }
        System.out.println("Summenwert des Arrays: " + summe);
        zeit = (System.nanoTime() - zeit) / 1000;
        System.out.println("Berechnet in " + zeit + "µs");
    }
}
