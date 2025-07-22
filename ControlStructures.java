// CONTROL STRUCTURES
public class ControlStructures {
    public static void main(String[] args) {
        // IF-ELSE STATEMENTS
        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are a child");
        }

        // SWITCH STATEMENT
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }

        // LOOPS

        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("While loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop (executes at least once)
        System.out.println("Do-while loop:");
        int num = 5;
        do {
            System.out.println("Num: " + num);
            num--;
        } while (num > 3);

        // Enhanced for loop (for arrays/collections)
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}