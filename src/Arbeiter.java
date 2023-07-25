public class Arbeiter implements Runnable {

    @Override
    public void run() {
        // wie normal
        for (int i=0; i<10; i++) {
            System.out.println("arbeiter: " + i);
            try { Thread.sleep(317); }
            catch (InterruptedException ignored) {}
        }
    }

}
