package week2;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean found = false;
        int target = 7;

        for(int number: numbers) {
            if (number == target) {
                System.out.println("Found target: " + number);
                found = true;
                return;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}