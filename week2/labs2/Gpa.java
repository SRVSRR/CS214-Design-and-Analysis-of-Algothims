package week2.labs2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Gpa{
    public static void main(String[] args){
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Thomas Knight", 3.9F));
        pq.add(new Student("Mary kim", 3.3F));

        while(!pq.isEmpty()){
            Student s =  pq.poll();
            System.out.println(s);
        }
    }
}