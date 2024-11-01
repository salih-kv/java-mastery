import utils.DateUtils;
import utils.MathUtils;
import utils.StringUtils;
import java.time.LocalDate;

public class UtilsExampleRunner {
  public static void main(String[] args) {
    System.out.println("Testing MathUtils:");
    System.out.println("5 + 3 = " + MathUtils.add(5, 3));
    System.out.println("10 - 2 = " + MathUtils.subtract(10, 2));
    System.out.println("6 * 7 = " + MathUtils.multiply(6, 7));
    try {
      System.out.println("10 / 0 = " + MathUtils.divide(10, 0));
    } catch (ArithmeticException e) {
      System.out.println("Caught exception: " + e.getMessage());
    }

    System.out.println("\nTesting StringUtils:");
    System.out.println("Reverse of 'hello' is '" + StringUtils.reverse("hello") + "'");
    System.out.println("Is 'madam' a palindrome? " + StringUtils.isPalindrome("madam"));
    System.out.println("Uppercase 'world' is '" + StringUtils.toUpperCase("world") + "'");

    System.out.println("\nTesting DateUtils:");
    LocalDate today = LocalDate.now();
    LocalDate futureDate = DateUtils.addDays(today, 10);
    System.out.println("10 days from now: " + futureDate);
    System.out.println("Days between today and 10 days from now: " + DateUtils.daysBetween(today, futureDate));
    System.out.println("Is 2024 a leap year? " + DateUtils.isLeapYear(2024));
  }
}
