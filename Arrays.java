// ARRAYS
public class Arrays {
    public static void main(String[] args) {
        // Array declaration and initialization
        int[] numbers = new int[5];        // Creates array of 5 integers
        String[] names = {"Alice", "Bob", "Charlie"}; // Direct initialization

        // Accessing and modifying array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println("First number: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);

        // Looping through arrays
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        System.out.println("All names:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // 2D Arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}