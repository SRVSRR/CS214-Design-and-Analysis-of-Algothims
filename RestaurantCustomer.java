/*
      Restaurant Order Queue System

      Problem: You are managing a restaurant's order system. Customers can either:
      1. Place an order and wait (ready = true)
      2. Browse the menu without ordering yet (ready = false)

      When processing orders:
      - If a customer is ready (has placed an order), serve them successfully
      - If a customer is not ready (still browsing), they leave without ordering

      Create a queue system that processes customers one by one, showing the queue size before each service attempt, and handles both scenarios appropriately.
*/

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class RestaurantCustomer {
    int customerNumber;
    Boolean ready;
    String name, orderItem, tableNumber;

    // Constructor when customer has placed an order (ready)
    RestaurantCustomer(int customerNumber, String name, String tableNumber, String orderItem) {
        this.customerNumber = customerNumber;
        this.name = name;
        this.orderItem = orderItem;
        this.tableNumber = tableNumber;
        this.ready = true;
    }

    // Constructor called when customer is still browsing (not ready)
    RestaurantCustomer(int customerNumber) {
        this.customerNumber = customerNumber;
        this.name = null;
        this.orderItem = null;
        this.tableNumber = null;
        this.ready = false;
    }

    boolean isReady() {
        return this.ready;
    }

    @Override
    public String toString() {
        if (this.ready == true) {
            return "Customer Number: " + this.customerNumber +
                    "\nCustomer Name: " + this.name +
                    "\nOrder Item: " + this.orderItem +
                    "\nTable Number: " + this.tableNumber;
        } else {
            return "Customer Number: " + this.customerNumber +
                    "\nCustomer Name: Unknown" +
                    "\nOrder Item: Still browsing" +
                    "\nTable Number: Table not booked";
        }
    }
}

class RestaurantOrderQueueSystem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Queue<RestaurantCustomer> orderQueue = new LinkedList<>();

        addCustomer(orderQueue);

        System.out.println("=== Welcome to Luigi's Restaurant Order System ===\n");

        while (!orderQueue.isEmpty()) {
            printQueueStatus(orderQueue, scanner);

            assert orderQueue.peek() != null;
            if (!orderQueue.peek().isReady()) {
                customerLeavesWithoutOrdering(orderQueue);
            } else {
                serveCustomer(orderQueue);
            }
        }

        System.out.println("All customers have been processed. Restaurant shift complete!");
        scanner.close();
    }

    static void addCustomer(Queue<RestaurantCustomer> queue) {
        queue.offer(new RestaurantCustomer(101)); // Just browsing
        queue.offer(new RestaurantCustomer(102, "Anav Chand", "Table-5", "Margherita Pizza"));
        queue.offer(new RestaurantCustomer(103)); // Just browsing
        queue.offer(new RestaurantCustomer(104, "John Smith", "Table-2", "Caesar Salad"));
        queue.offer(new RestaurantCustomer(105, "Vishant Kumar", "Table-8", "Chicken Alfredo"));
    }

    static void printQueueStatus(Queue<RestaurantCustomer> queue, Scanner scanner) {
        System.out.println("🍽️  Current Queue Status: " + queue.size() + " customer(s) waiting to be served");
        System.out.print("Press Enter to serve the next customer: ");
        scanner.nextLine();
        System.out.println();
    }

    static void customerLeavesWithoutOrdering(Queue<RestaurantCustomer> queue) throws Exception {
        System.out.println("❌ Customer is still browsing the menu and decides to leave...");
        Thread.sleep(2000);
        System.out.println("\nCustomer Details:");
        System.out.println(queue.peek());
        System.out.println("\nCustomer left without placing an order.");
        queue.poll();
        Thread.sleep(2000);
        System.out.println("=====================================\n");
    }

    static void serveCustomer(Queue<RestaurantCustomer> queue) throws Exception {
        System.out.println("👨‍🍳 Preparing order for customer...");
        Thread.sleep(2000);
        System.out.println("\nCustomer Details:");
        System.out.println(queue.peek());
        Thread.sleep(1500);
        queue.poll();
        System.out.println("\n✅ Order served successfully!");
        Thread.sleep(1000);
        System.out.println("=====================================\n");
    }
}