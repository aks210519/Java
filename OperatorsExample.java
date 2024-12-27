public class OperatorsExample {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 20;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division
        System.out.println("b % a = " + (b % a)); // Modulus (Remainder)

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // 4. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int c = 5;  // 0101 in binary
        int d = 7;  // 0111 in binary

        System.out.println("c & d: " + (c & d)); // Bitwise AND
        System.out.println("c | d: " + (c | d)); // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d)); // Bitwise XOR
        System.out.println("~c: " + (~c));       // Bitwise NOT
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("d >> 1: " + (d >> 1)); // Right shift

        // 5. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int e = 10;
        System.out.println("e = " + e);    // Assign value
        e += 5;                            // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3;                            // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2;                            // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 4;                            // e = e / 4
        System.out.println("e /= 4: " + e);
        e %= 2;                            // e = e % 2
        System.out.println("e %= 2: " + e);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        int f = 10;
        System.out.println("f = " + f);
        System.out.println("++f: " + (++f)); // Pre-increment
        System.out.println("f++: " + (f++)); // Post-increment
        System.out.println("f now: " + f);
        System.out.println("--f: " + (--f)); // Pre-decrement
        System.out.println("f--: " + (f--)); // Post-decrement
        System.out.println("f now: " + f);

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int g = (a > b) ? a : b;
        System.out.println("g (max of a and b) = " + g); // If a > b, g = a, else g = b

        for(int i=10;i>=0;i--){
            System.out.println(i);

        }



    }
}
