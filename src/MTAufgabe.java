public class MTAufgabe {

    public static void main(String[] args) {
        int[] int_array = new int[ 10_000_000 ];

        // mit zufälligen Werten befüllen
        for (int i = 0; i < int_array.length; i++) {
            int_array[i] = (int)(Math.random() * 100);
        }

        long zeit = System.nanoTime();
        // Aufgabe
        int summe = 0;
        for (int element : int_array) summe += element;
        System.out.println("Summenwert des Arrays: " + summe);
        zeit = (System.nanoTime() - zeit) / 1000;
        System.out.println("Berechnet in " + zeit + "µs");
    }
}
