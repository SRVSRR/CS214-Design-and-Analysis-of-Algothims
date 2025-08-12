package week3;

class greet implements Runnable {
    private final String greeting;

    public greet(String greeting) {
        this.greeting = greeting; // store greeting word
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + ": " + greeting); // print counter + greeting
                Thread.sleep(500); // pause for 0.5 seconds
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class threadtest {
    public static void main(String [] args) {
        Thread t1 = new Thread(new greet("Hello")); // first task
        Thread t2 = new Thread(new greet("bye"));   // second task

        t1.start(); // starts first thread
        t2.start(); // starts second thread
    }
}
