public class Lager {
    private int bestand;

    public Lager(int bestand) {
        this.bestand = bestand;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public synchronized void beliefern(int anzahl) {
        bestand += anzahl;
    }
}
