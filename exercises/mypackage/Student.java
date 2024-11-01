package mypackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
  private String name;
  private int[] marks;

  public Student(String name, int... marks) {
    this.name = name;
    this.marks = marks;
  }

  public int getNumberOfMarks() {
    return marks.length;
  }

  public int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }
    return sum;
  }

  public BigDecimal getAverageOfMarks() {
    int sum = getTotalSumOfMarks();
    return new BigDecimal(sum).divide(new BigDecimal(marks.length), 3, RoundingMode.UP);
  }

  public int getMaximumMark() {
    int max = Integer.MIN_VALUE;
    for (int mark : marks) {
      if (mark > max) {
        max = mark;
      }
    }
    return max;
  }

  public int getMinimumMark() {
    int min = Integer.MAX_VALUE;
    for (int mark : marks) {
      if (mark < min) {
        min = mark;
      }
    }
    return min;
  }

  public void addMark(int newMark) {
    int[] newMarks = Arrays.copyOf(marks, marks.length + 1);
    newMarks[marks.length] = newMark;
    this.marks = newMarks;
  }

  // Method to remove a mark at a specified index
  public void removeMarkAtIndex(int index) {
    if (index < 0 || index >= marks.length) {
      throw new IndexOutOfBoundsException("Invalid index");
    }
    int[] newMarks = new int[marks.length - 1];
    for (int i = 0, j = 0; i < marks.length; i++) {
      if (i != index) {
        newMarks[j++] = marks[i];
      }
    }
    this.marks = newMarks;
  }
}
