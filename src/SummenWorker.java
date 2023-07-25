public class SummenWorker extends Thread {
    private int[] int_array;
    private int start_index;
    private int end_index;
    private int ergebnis;

    public SummenWorker(int[] int_array, int start_index, int end_index) {
        this.int_array = int_array;
        this.start_index = start_index;
        this.end_index = end_index;
        this.ergebnis = 0;
    }

    public int getErgebnis() {
        return ergebnis;
    }

    public void run() {
        for (int i=start_index; i<end_index; i++) {
            ergebnis += int_array[i];
        }
    }
}
