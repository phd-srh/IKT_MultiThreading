public class Main {

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.start();

        for (int i=0; i<10; i++) {
            System.out.println("main: " + i);
            Thread.sleep(100);
        }

        worker.join();
        System.out.println("Feddisch");
    }
}
