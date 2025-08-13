package week2.labs2;

public class FibonacciRecursive {
    private long count;
    public long compute(int n) {
        count++;
        if (n <= 1) {
            return n;
        } else {
            return compute(n - 1) + compute(n - 2);
        }
    }

    public void setCount(long n) {
        this.count = n;
    }

    public long getCount() {
        return this.count;
    }
}
