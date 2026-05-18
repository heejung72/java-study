package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        count++;
    }

    public void getCount() {
        if (count > max) {
            return;
        }
        count++;
    }
}
