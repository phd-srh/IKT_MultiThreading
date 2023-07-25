public class Lieferant extends Thread {
    private Lager lager;

    public Lieferant(Lager lager) {
        this.lager = lager;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500_000; i++) {
            lager.beliefern(1);
        }
    }
}
