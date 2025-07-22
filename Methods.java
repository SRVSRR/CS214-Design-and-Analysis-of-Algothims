// METHODS
public class Methods {
    // Method with no parameters and no return value
    public static void greet() {
        System.out.println("Hello there!");
    }

    // Method with parameters and return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with different parameter types
    public static void displayInfo(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
    }

    // Method overloading (same name, different parameters)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method that modifies an array (arrays are passed by reference)
    public static void doubleArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    public static void main(String[] args) {
        // Calling methods
        greet();

        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);

        displayInfo("John", 25, 175.5);

        // Method overloading demonstration
        System.out.println("Int multiply: " + multiply(4, 5));
        System.out.println("Double multiply: " + multiply(4.5, 2.0));

        // Array modification
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before: " + java.util.Arrays.toString(numbers));
        doubleArray(numbers);
        System.out.println("After: " + java.util.Arrays.toString(numbers));
    }
}