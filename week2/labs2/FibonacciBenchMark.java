package week2.labs2;

public class FibonacciBenchMark {
    public static void main(String[] args){
        int[] itrTest = {5,10,15,20,30,40,50,100};
        int[] recTest = {5,10,15,20,30,40,50};

        FibonacciRecursive rec  = new FibonacciRecursive();
        FibonacciIterative itr  = new FibonacciIterative();

        for(int i : itrTest){
            long start = System.nanoTime();
            long result = itr.compute(i);
            long end = System.nanoTime();
            int counter = itr.count();
            System.out.printf("n = %d, time = %d, result = %d passes = %d \n", i, (end-start), result, counter);
        }

        for(int i : recTest){
            long start = System.nanoTime();
            long result = rec.compute(i);
            long end = System.nanoTime();
            long counter = rec.getCount();
            System.out.printf("n = %d, time = %d, result = %d, passes = %d \n", i, (end-start), result, counter);
        }
    }
}