// PRIMITIVE DATA TYPES
public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte smallNum = 127;        // -128 to 127
        short mediumNum = 32000;    // -32,768 to 32,767
        int number = 42;            // -2 billion to 2 billion (most common)
        long bigNum = 123456789L;   // Very large numbers (note the 'L')

        // Floating-point types
        float decimal = 3.14f;      // 32-bit decimal (note the 'f')
        double precise = 3.14159;   // 64-bit decimal (default for decimals)

        // Other types
        char letter = 'A';          // Single character
        boolean isTrue = true;      // true or false

        // String (reference type, not primitive)
        String text = "Hello Java!";

        // Variable declaration and initialization
        int age;                    // Declaration
        age = 25;                   // Initialization
        int height = 180;           // Declaration + initialization

        // Constants (final keyword)
        final double PI = 3.14159;  // Cannot be changed

        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
        System.out.println("Is true: " + isTrue);
    }
}