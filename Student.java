import java.util.*;

// Student class to hold name and GPA
public class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

// Separate Comparator to order by GPA (descending)
class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sort in descending order of GPA
        return Double.compare(s2.gpa, s1.gpa);
    }
}

class Main {
    public static void main(String[] args) {
        // PriorityQueue with custom comparator (highest GPA first)
        PriorityQueue<Student> gpaQueue = new PriorityQueue<>(new GPAComparator());

        // Add students
        gpaQueue.add(new Student("Alice", 3.9));
        gpaQueue.add(new Student("Bob", 3.5));
        gpaQueue.add(new Student("Charlie", 4.0));
        gpaQueue.add(new Student("Diana", 3.7));

        // Polling from the queue: should return in descending GPA order
        System.out.println("Students ordered by GPA (highest to lowest):");
        while (!gpaQueue.isEmpty()) {
            System.out.println(gpaQueue.poll());
        }
    }
}
