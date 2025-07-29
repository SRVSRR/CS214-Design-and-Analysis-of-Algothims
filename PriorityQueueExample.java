import java.util.*;

// Student class with name and GPA
class StudentPQ {
    String name;
    double gpa;

    // Constructor
    public StudentPQ(String name, double gpa) {
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
class GPAComparatorPQ implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.gpa, s1.gpa);
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue with custom comparator
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(new GPAComparatorPQ());

        // Add students
        studentQueue.add(new Student("Alice", 3.8));
        studentQueue.add(new Student("Bob", 3.4));
        studentQueue.add(new Student("Charlie", 3.9));
        studentQueue.add(new Student("Diana", 3.6));

        // Display students in priority order (highest GPA first)
        System.out.println("Students in GPA order:");
        while (!studentQueue.isEmpty()) {
            System.out.println(studentQueue.poll());
        }
    }
}
