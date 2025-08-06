package week2.labs2;

public class Student implements Comparable {
    private final float gpa;
    private final String fullName;

    public Student(String fullName, float gpa) {
        this.fullName = fullName;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Student: " + this.fullName + " | GPA: " + this.gpa;
    }

    @Override
    public int compareTo(Object obj){
        if(!(obj instanceof Student)){
            throw new ClassCastException("not type student");
        }
        Student s = (Student)obj;
        return Float.compare(s.gpa, this.gpa);
    }
}