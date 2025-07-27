import java.util.Scanner; // Import the Scanner class

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        // Ask for user's favorite color
        System.out.print("Enter your favorite color: ");
        String color = input.nextLine();

        // Display the results
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color + ".");
    }
}
