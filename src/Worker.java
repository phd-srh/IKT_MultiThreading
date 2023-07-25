public class Worker extends Thread {

    @Override
    public void run() {
        // ist wie main(), nur als extra Thread
        for (int i=0; i<10; i++) {
            System.out.println("run: " + i);
            try { sleep(500); }
            catch (InterruptedException ignored) {}
        }
    }
}
