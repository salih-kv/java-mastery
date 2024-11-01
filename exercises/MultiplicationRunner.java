import mypackage.MultiplicationTable;

public class MultiplicationRunner {
  public static void main(String[] args) {
    MultiplicationTable table = new MultiplicationTable();

    table.print();
    table.print(5);
    table.print(5, 1, 10);
  }
}
