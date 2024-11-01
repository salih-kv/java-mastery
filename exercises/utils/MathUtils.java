package utils;

public class MathUtils {

  public static int add(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static int divide(int a, int b) throws ArithmeticException {
    if (b == 0)
      throw new ArithmeticException("Cannot divide by zero");
    return a / b;
  }
}
