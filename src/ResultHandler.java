public class ResultHandler {
    private long summe;
    private int numResults;
    private int numThreads;
    private long zeitStempel;
    private boolean running;

    public ResultHandler(int numThreads) {
        this.numThreads = numThreads;
        this.summe = 0;
        this.numResults = 0;
        this.running = true;
    }

    public long getZeitStempel() {
        while (running) {
            try { Thread.sleep(500); }
            catch (InterruptedException ignored) {}
        }
        return zeitStempel;
    }

    public synchronized void sendResult(long ergebnis) {
        summe += ergebnis;
        numResults++;
        if (numResults == numThreads) {
            System.out.println("Summenwert des Arrays: " + summe);
            this.running = false;
            this.zeitStempel = System.nanoTime();
        }
    }
}
