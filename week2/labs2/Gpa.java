package week2.labs2;

import java.util.PriorityQueue;

public class Gpa{
    public static void main(String[] args){
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Thomas Knight", 3.9F));
        pq.add(new Student("Mary kim", 3.3F));
        pq.add(new Student("Tim Drake", 3.5F));
        pq.add(new Student("Dick Grayson", 4.3F));
        pq.add(new Student("Damien kim", 2.3F));

        while(!pq.isEmpty()){
            Student s =  pq.poll();
            System.out.println(s);
        }
    }
}