package week2.labs2;

public class FibonacciIterative {
    public int count;
    public long compute(int n) {
        if (n <= 1)
            return n;

        long a = 0, b = 1, result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
            count++;
        }

        return result;
    }

    public int count() {
        return count;
    }
}
