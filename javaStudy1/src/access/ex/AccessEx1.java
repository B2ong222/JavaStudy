package access.ex;

public class AccessEx1 {
    static void main() {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}

class MaxCounter {
    private int count;
    private int max;
    public MaxCounter(int max) {
        this.count = 0;
        this.max = max;
    }
    public void increment() {
        if (count >= max) {
            System.out.println("최대값초과x");
            return;
        }
        count++;
    }
    public int getCount() { return count; }
}