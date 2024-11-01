// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Method that throws an exception if age is less than 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Will throw the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
