package labs1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Labs1CallerV3 {
    public static <Caller> void main(String[] args){
        Queue<Caller> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to ANZ Bank");

        while(true){
            System.out.println("Enter command: ");
            System.out.println("Enter 1: New Call");
            System.out.println("Enter 2: Serve Call ");
            System.out.println("Enter 3: View Queue ");
            System.out.println("Enter 4: Hangup");
            System.out.println("Enter 5: Exit ");



            input = scanner.nextLine();
            switch(input){
                case "1": // Enter phone number
                    System.out.println("Enter phone number");
                    Caller number = scanner.nextLine();
                    queue.add(number);
                    break;
                case "2": //  Remove phone number
                    System.out.println("Removing number");
                    Caller removedNumber = queue.remove();
                    System.out.println("Number removed: " +  removedNumber);
                    break;
                case "3": // Numbers in queue
                    System.out.println("Numbers in queue" + queue);
                    break;
                case "4":
                    System.out.println("Enter phone number");
                    String hangUp = scanner.nextLine();
                    queue.remove(new Caller(hangUp));
                    System.out.println("Number: " + hangUp + " was removed from queue");
                    break;
                case "5":
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }

    }
}

