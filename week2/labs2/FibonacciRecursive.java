package week2.labs2;

public class FibonacciRecursive{
    public long compute(int n){
        if(n <= 1)
            return n;
        else
            return compute(n-1)+compute(n-2);

    }
}