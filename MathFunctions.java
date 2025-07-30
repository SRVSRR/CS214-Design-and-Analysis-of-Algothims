import java.lang.Math;

public class MathFunctions{
    public static void main(String[] arg){
        // Absolute of any number
        int abs = -10;
        abs = Math.abs(abs);
        System.out.println(abs);

        // exponential of number
        double expo = 10;
        expo = Math.exp(expo);
        System.out.println(expo);

        double result3 = Math.floorDiv(-100,9);
        System.out.println("result3: " + result3);

        double result4 = -100 / 9;
        System.out.println("result4: " + result4);

        int min = Math.min(10, 20);
        System.out.println("min: " + min);
        
        int max = Math.max(20, 30);
        System.out.println("max: " + max);

    }
}