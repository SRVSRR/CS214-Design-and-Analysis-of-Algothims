public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic operators
        System.out.println("Addition: " + (a + b));      // 13
        System.out.println("Subtraction: " + (a - b));   // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3 (integer division)
        System.out.println("Modulus: " + (a % b));        // 1 (remainder)

        // Increment/Decrement
        int x = 5;
        x++;        // x = x + 1 (post-increment)
        ++x;        // x = x + 1 (pre-increment)
        x--;        // x = x - 1 (post-decrement)
        --x;        // x = x - 1 (pre-decrement)

        // Assignment operators
        int y = 10;
        y += 5;     // y = y + 5 (y becomes 15)
        y -= 3;     // y = y - 3 (y becomes 12)
        y *= 2;     // y = y * 2 (y becomes 24)
        y /= 4;     // y = y / 4 (y becomes 6)

        // Comparison operators
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));     // true
        System.out.println("a < b: " + (a < b));     // false
        System.out.println("a >= b: " + (a >= b));   // true
        System.out.println("a <= b: " + (a <= b));   // false

        // Logical operators
        boolean p = true, q = false;
        System.out.println("p && q: " + (p && q));   // false (AND)
        System.out.println("p || q: " + (p || q));   // true (OR)
        System.out.println("!p: " + (!p));           // false (NOT)
    }
}