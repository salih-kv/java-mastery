package utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtils {

  public static long daysBetween(LocalDate start, LocalDate end) {
    return ChronoUnit.DAYS.between(start, end);
  }

  public static boolean isLeapYear(int year) {
    return LocalDate.of(year, 1, 1).isLeapYear();
  }

  public static LocalDate addDays(LocalDate date, int days) {
    return date.plusDays(days);
  }
}
