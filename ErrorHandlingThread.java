public class ErrorHandlingThread {
    static class MyThread extends Thread {
        public void run() {
            try {
                // Perform a task that may throw an exception
                int result = 10 / 0; // This will cause an ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handle the exception within the thread
                System.out.println("Thread error: Division by zero is not allowed.");
            }
        }
    }

    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new MyThread();

        // Set a custom UncaughtExceptionHandler to handle exceptions that are not
        // caught in the thread
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Unhandled exception in thread " + t.getName() + ": " + e);
        });

        // Start the thread
        thread.start();

        // Continue with the program
        System.out.println("Main thread continues...");
    }
}
