/*




*/

package LSTimeComplexity;

public class average{
    public static long compute(int n){
        if(n>0){
            return n + compute(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        long result = compute(10);
        System.out.println(result);
    }
}

