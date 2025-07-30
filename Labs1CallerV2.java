import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Labs1CallerV2 {
    int phoneNumber;
    String name, message, location;
    boolean onhold;

    // Constructor for users that answer the call (on hold)
    public Labs1CallerV2(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.onhold = true;
        this.name = null;
        this.message = null;
        this.location = null;
    }

    // Constructor for callers that pick up (not on hold)
    public Labs1CallerV2(int phoneNumber, String name, String location, String message) {
        this.phoneNumber = phoneNumber;
        this.onhold = false;
        this.name = name;
        this.message = message;
        this.location = location;
    }

    // Getter method for onhold status
    public boolean isOnHold() {
        return this.onhold;
    }

    // Turn values into string to display to users
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

        addCallers(queue);

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

    static void addCallers(Queue<Labs1CallerV2> queue) {
        queue.offer(new Labs1CallerV2(9253817));
        queue.offer(new Labs1CallerV2(9589388));
        queue.offer(new Labs1CallerV2(9318492, "Anav", "Unknown", "Balls"));
        queue.offer(new Labs1CallerV2(2293013));
        queue.offer(new Labs1CallerV2(7438293, "Vishant", "Unknown", "Hello"));
    }

    static void printQueueSize(Queue<Labs1CallerV2> queue, Scanner scanner) {
        System.out.println("The Line Currently Has " + queue.size() + " Customer(s) on Hold");
        System.out.print("Press Enter To Serve Customer: ");
        scanner.nextLine();
    }

    static void customerHungUp(Queue<Labs1CallerV2> queue) throws Exception {
        System.out.println("Sorry The Customer You Are Trying to Serve Has Hung Up");
        Thread.sleep(3000);
        System.out.println();
        System.out.println(queue.peek());
        queue.poll();
        Thread.sleep(3000);
        System.out.println();
    }

    static void customerServed(Queue<Labs1CallerV2> queue) throws Exception {
        System.out.println("Customer is Being Served :)...");
        Thread.sleep(3000);
        queue.poll();
        System.out.println("Customer Served!");
        Thread.sleep(1000);
        System.out.println();
    }
}