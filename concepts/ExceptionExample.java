public class ExceptionExample {
    public static void main(String[] args) {
        // Try-catch block to handle exceptions
        // try block contains the code that may throw an exception (means it may produce an error)
        // catch block catches the exception and handles it
        // finally block always executes, regardless of whether an exception is thrown or not

        try {
            // Attempting to divide by zero, which throws an ArithmeticException
            // which means we can't divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the exception and printing a message
            System.out.println("Cannot divide by zero.");
        } finally {
            // The finally block always executes
            // Irrespective of whether an exception is thrown or not
            // this block always executes
            System.out.println("End of program.");
        }
    }
}
