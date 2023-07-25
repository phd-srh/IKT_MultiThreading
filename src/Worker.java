public class Worker extends Thread {

    private boolean running = false;

    public boolean isRunning() {
        return running;
    }

    @Override
    public void run() {
        running = true;
        // ist wie main(), nur als extra Thread
        for (int i=0; i<10; i++) {
            System.out.println("run: " + i);
            try { sleep(500); }
            catch (InterruptedException ignored) {}
        }
        running = false;
    }
}
