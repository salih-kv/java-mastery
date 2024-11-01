import mypackage.Student;
import java.math.BigDecimal;

public class StudentRunner {
  public static void main(String[] args) {
    Student student = new Student("Ranga", 97, 98, 100);

    int number = student.getNumberOfMarks();
    System.out.println("Number of marks : " + number);
    int sum = student.getTotalSumOfMarks();
    System.out.println("Sum of marks : " + sum);

    int maximumMark = student.getMaximumMark();
    System.out.println("Maximum of marks : " + maximumMark);
    int minimumMark = student.getMinimumMark();
    System.out.println("Minimum of marks : " + minimumMark);
    BigDecimal average = student.getAverageOfMarks();
    System.out.println("Average of marks : " + average);

    student.addMark(35);
    System.out.println("Added a mark. New number of marks : " + student.getNumberOfMarks());
    student.removeMarkAtIndex(1);
    System.out.println("Removed mark at index 1. New number of marks : " + student.getNumberOfMarks());
  }
}
