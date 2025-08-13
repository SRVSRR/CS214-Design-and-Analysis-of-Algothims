package week4;

class car implements Runnable{
    public double speed;
    public int condition;

    public void run(){
        move();
    }

    public void move(){

    }
}

public class carthreads{
    public static void main(String[] args){
        Runnable c1 = new car();
        car c2 = new car();

        Thread t1 = new Thread(new car());
        Thread t2 = new Thread((Runnable)c2);

        t1.start();
        t2.start();
    }
}