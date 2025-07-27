import java.util.*;

// 1. MyStack class (Generic + Encapsulation + Abstraction via Iterable)
class MyStack<T> implements Iterable<T> {
    private Stack<T> s;        // Encapsulated Stack
    private int maxSize;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.s = new Stack<>();
    }

    // Push an element if stack isn't full
    public void push(T item) {
        if (s.size() < maxSize) {
            s.push(item);
        } else {
            System.out.println("Stack is full!");
        }
    }

    // Pop an element
    public T pop() {
        if (!s.isEmpty()) {
            return s.pop();
        }
        System.out.println("Stack is empty!");
        return null;
    }

    public int size() {
        return s.size();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    // Provide an iterator for the stack (Abstraction)
    @Override
    public Iterator<T> iterator() {
        return s.iterator();
    }
}

// 2. Subclass demonstrating Inheritance
class NumberStack extends MyStack<Integer> {
    public NumberStack(int size) {
        super(size);
    }

    // Polymorphism (method specific to this subclass)
    public int sumAll() {
        int sum = 0;
        for (int num : this) {
            sum += num;
        }
        return sum;
    }
}

// 3. Main class to test all OOP concepts
public class Stacks {
    public static void main(String[] args) {
        // Create a stack of strings (generic)
        MyStack<String> stringStack = new MyStack<>(3);
        stringStack.push("Java");
        stringStack.push("OOP");
        stringStack.push("Rocks");
        stringStack.push("Overflow");  // Should show "Stack is full!"

        // Iterating over stringStack (uses Iterable interface)
        System.out.println("String Stack Contents:");
        for (String item : stringStack) {
            System.out.println(item);
        }

        // Use subclass (NumberStack) to demonstrate inheritance and polymorphism
        NumberStack numStack = new NumberStack(5);
        numStack.push(10);
        numStack.push(20);
        numStack.push(30);

        System.out.println("\nNumber Stack Contents:");
        for (int n : numStack) {
            System.out.println(n);
        }

        // Polymorphism: subclass adds its own behavior
        System.out.println("Sum of NumberStack: " + numStack.sumAll());
    }
}
