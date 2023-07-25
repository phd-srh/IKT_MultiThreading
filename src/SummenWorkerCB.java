public class SummenWorkerCB extends Thread {
    private int[] int_array;
    private int start_index;
    private int end_index;
    private long ergebnis;
    private ResultHandler resultHandler;

    public SummenWorkerCB(int[] int_array, int start_index, int end_index,
                          ResultHandler resultHandler) {
        this.int_array = int_array;
        this.start_index = start_index;
        this.end_index = end_index;
        this.resultHandler = resultHandler;
        this.ergebnis = 0;
    }

    public void run() {
        for (int i=start_index; i<end_index; i++) {
            ergebnis += int_array[i];
        }
        resultHandler.sendResult(ergebnis);
    }
}
