package week2;

import java.util.ArrayList;
import week2.Student;

public class Generic {
    static <T extends Comparable<T>> int sequentialSearch(final T key, final ArrayList<T> in) {
        int loc = 0;

        while(loc < in.size() && in.get(loc).compareTo(key) != 0) {
            loc++;
        }

        if(loc >= in.size()) {
            loc = -1;
        }

        return loc;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "Anav"));
        students.add(new Student(2, "John"));
        students.add(new Student(3, "Fred"));

        System.out.println(sequentialSearch(new Student(2, "John"), students));
    }
}