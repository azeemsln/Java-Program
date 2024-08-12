public class ErrorHandling {
    // Method that divides two numbers and handles potential exception
    public static int divide(int a, int b) {
        // Perform division
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // Set num2 to 0 to cause an exception

        // Try-catch block to handle exceptions
        try {
            // Try to divide num1 by num2
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Finally block that always executes
            System.out.println("Division attempt completed.");
        }

        // Continue with the program
        System.out.println("Program continues...");
    }
}
