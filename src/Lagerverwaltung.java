public class Lagerverwaltung {
    public static void main(String[] args) throws InterruptedException {
        Lager lager = new Lager(0);
        Lieferant lieferant1 = new Lieferant(lager);
        Lieferant lieferant2 = new Lieferant(lager);
        lieferant1.start();
        lieferant2.start();
        // jetzt wird gearbeitet
        lieferant1.join();
        lieferant2.join();
        System.out.println("Summe: " + lager.getBestand() );
    }
}
