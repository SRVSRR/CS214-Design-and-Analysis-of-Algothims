import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Labs1Caller {

    int pNum;
    String name, message;
    boolean isOnHold;

    // Constructor 1: Only phone number
    public Labs1Caller(int pNum) {
        this.pNum = pNum;
        this.isOnHold = true;
        this.name = "Unknown";
        this.message = "None";
    }

    // Constructor 2: Full information
    public Labs1Caller(int pNum, String name, String message) {
        this.pNum = pNum;
        this.name = name;
        this.message = message;
        this.isOnHold = false;
    }

    @Override
    public String toString() {
        return "Caller Name: " + name +
                "\nCaller Number: " + pNum +
                "\nCaller Message: " + message +
                "\nOn Hold: " + isOnHold;
    }
}

class Lab1Solution{
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        Queue<Labs1Caller> queue = new LinkedList<>();

        addCallers(queue);

        while(!queue.isEmpty()){
            printQueueSize(queue,scanner);

            if(!queue.peek().isOnHold){
                customerHungUp(queue);
            }
            else{
                customerServed(queue);
            }
        }

    }

    static void addCallers(Queue<Labs1Caller> queue){
        queue.offer(new Labs1Caller(9253817));
        queue.offer(new Labs1Caller(9589388));
        queue.offer(new Labs1Caller(9318492, "Aveshal", "I Would Like To Speak To Your Boyyy"));
        queue.offer(new Labs1Caller(2293013));
        queue.offer(new Labs1Caller(7438293, "Ashilta", "Hello World"));

    }

    static void printQueueSize(Queue<Labs1Caller> queue, Scanner scanner){
        System.out.println("The Line Currently Has "+queue.size()+" Customer(s) on Hold");
        System.out.print("Press Enter To Serve Customer: ");
        scanner.nextLine();
    }

    static void customerHungUp(Queue<Labs1Caller> queue) throws Exception{
        System.out.println("Sorry The Customer You Are Trying to Serve Has Hung Up");
        Thread.sleep(3000);
        System.out.println();
        System.out.println(queue.peek());
        queue.poll();
        Thread.sleep(3000);
        System.out.println();
    }

    static void customerServed(Queue<Labs1Caller> queue) throws Exception{
        System.out.println("Customer is Being Served :)...");
        Thread.sleep(3000);
        queue.poll();
        System.out.println("Cutomer Served!");
        Thread.sleep(1000);
        System.out.println();
    }


}
