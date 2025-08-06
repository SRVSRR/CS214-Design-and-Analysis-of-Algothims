package week2.labs2;

import java.util.*;

// Student class with name and GPA
class StudentGrades {
    String name;
    double gpa;

    // Constructor
    public StudentGrades(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // To display student details
    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

// Comparator to sort students by GPA (descending)
class GPAComparatorPQ implements Comparator<StudentGrades> {
    @Override
    public int compare(StudentGrades s1, StudentGrades s2) {
        return Double.compare(s2.gpa, s1.gpa);
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue with custom comparator
        PriorityQueue<StudentGrades> studentQueue = new PriorityQueue<>(new GPAComparatorPQ());

        // Add students
        studentQueue.add(new StudentGrades("Alice", 3.8));
        studentQueue.add(new StudentGrades("Bob", 3.4));
        studentQueue.add(new StudentGrades("Charlie", 3.9));
        studentQueue.add(new StudentGrades("Diana", 3.6));

        // Display students in priority order (highest GPA first)
        System.out.println("Students in GPA order:");
        while (!studentQueue.isEmpty()) {
            System.out.println(studentQueue.poll());
        }
    }
}
