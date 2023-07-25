public class Main {

    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        System.out.println("Worker Status: " + worker.isRunning());
        worker.start();

        for (int i=0; i<10; i++) {
            System.out.println("main: " + i);
            System.out.println("Worker Status: " + worker.isRunning());
            Thread.sleep(100);
        }

        //worker.join(); möglich, aber passives Warten
        while ( worker.isRunning() ) { // Polling (aktives Warten)
            System.out.println("main: ein paar kleine Nebenarbeiten");
            Thread.sleep(500);
        }
        System.out.println("Worker Status: " + worker.isRunning());
        System.out.println("Feddisch");
    }
}
