package mypackage;

public class MultiplicationTable {
	public void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}
	}

	public void print(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", number, i, number * i).println();
		}
	}

	public void print(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", number, i, number * i).println();
		}
	}
}
