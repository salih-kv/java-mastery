package utils;

public class StringUtils {

  public static String reverse(String input) {
    return new StringBuilder(input).reverse().toString();
  }

  public static boolean isPalindrome(String input) {
    String reversed = reverse(input);
    return input.equalsIgnoreCase(reversed);
  }

  public static String toUpperCase(String input) {
    return input.toUpperCase();
  }
}
