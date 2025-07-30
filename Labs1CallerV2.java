import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Labs1CallerV2 {
    int phoneNumber;
    String name, message, location;
    boolean onhold;

    // Constructor for users that are on hold
    public Labs1CallerV2(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.onhold = true;
        this.name = null;
        this.message = null;
        this.location = null;
    }

    // Constructor for users that answered (not on hold)
    public Labs1CallerV2(int phoneNumber, String name, String location, String message) {
        this.phoneNumber = phoneNumber;
        this.onhold = false;
        this.name = name;
        this.message = message;
        this.location = location;
    }

    public boolean isOnHold() {
        return this.onhold;
    }

    @Override
    public String toString() {
        return "Caller name: " + name +
                "\nPhone Number: " + phoneNumber +
                "\nLocation: " + location +
                "\nMessage: " + message;
    }
}

class Lab1SolutionV2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Queue<Labs1CallerV2> queue = new LinkedList<>();

        // Dynamically get caller entries from user
        addCallers(queue, scanner);

        while (!queue.isEmpty()) {
            printQueueSize(queue, scanner);

            assert queue.peek() != null;
            if (!queue.peek().isOnHold()) {
                customerHungUp(queue);
            } else {
                customerServed(queue);
            }
        }

        scanner.close();
    }

    static void addCallers(Queue<Labs1CallerV2> queue, Scanner scanner) {
        System.out.println("=== Add Callers to Queue ===");
        boolean addMore = true;

        while (addMore) {
            System.out.print("Enter phone number: ");
            int phoneNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Is the caller on hold? (yes/no): ");
            String onHoldInput = scanner.nextLine().trim().toLowerCase();

            if (onHoldInput.equals("yes")) {
                queue.offer(new Labs1CallerV2(phoneNumber));
            } else {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter location: ");
                String location = scanner.nextLine();

                System.out.print("Enter message: ");
                String message = scanner.nextLine();

                queue.offer(new Labs1CallerV2(phoneNumber, name, location, message));
            }

            System.out.print("Add another caller? (yes/no): ");
            String again = scanner.nextLine().trim().toLowerCase();
            addMore = again.equals("yes");
        }

        System.out.println("All callers added to the queue.\n");
        while (!queue.isEmpty()) {
            printQueueSize(queue, scanner);
        }
    }

    static void printQueueSize(Queue<Labs1CallerV2> queue, Scanner scanner) {
        System.out.println("The Line Currently Has " + queue.size() + " Customer(s) on Hold");
        System.out.print("Press Enter To Serve Customer: ");
        scanner.nextLine();
    }

    static void customerHungUp(Queue<Labs1CallerV2> queue) throws Exception {
        System.out.println("Sorry, the customer you are trying to serve has hung up.");
        Thread.sleep(3000);
        System.out.println(queue.peek());
        Thread.sleep(3000);
        System.out.println();
        queue.poll();
    }

    static void customerServed(Queue<Labs1CallerV2> queue) throws Exception {
        System.out.println("Customer is being served :)...");
        Thread.sleep(3000);
        System.out.println("Customer served!");
        Thread.sleep(1000);
        System.out.println();
        queue.poll();
    }
}
