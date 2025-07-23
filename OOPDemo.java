// OBJECT-ORIENTED PROGRAMMING
// Class definition
class Person {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String email;

    // Constructor - special method called when object is created
    public Person(String name, int age, String email) {
        this.name = name;     // 'this' refers to current object
        this.age = age;
        this.email = email;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "";
    }

    // Getter methods (accessors)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods (mutators)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Instance methods
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public boolean isAdult() {
        return age >= 18;
    }

    // toString method for string representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}

// Using the class
public class OOPDemo {
    public static void main(String[] args) {
        // Creating objects (instances)
        Person person1 = new Person("Alice", 25, "alice@email.com");
        Person person2 = new Person();

        // Using object methods
        person1.introduce();
        System.out.println("Is adult: " + person1.isAdult());

        // Using getters and setters
        person2.setName("Bob");
        person2.setAge(17);
        person2.setEmail("bob@email.com");

        System.out.println("Person 2 name: " + person2.getName());
        person2.introduce();

        // toString method
        System.out.println(person1.toString());
        System.out.println(person2); // toString called automatically
    }
}
