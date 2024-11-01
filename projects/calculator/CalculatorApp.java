import java.util.Scanner;

// Calculator class with basic operations
class Calculator {

    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division with basic error handling
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0; // Return 0 if division by zero
        }
        return a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Simple Calculator");
        System.out.println("Available operations: +, -, *, /");
        
        // Continuously take user input until they want to exit
        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = calculator.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
            }

            // Option to continue or exit
            System.out.print("Do you want to perform another calculation? (yes to continue, no to exit): ");
            String continueCalc = scanner.next();
            if (!continueCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}
