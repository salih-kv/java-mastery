import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements
        System.out.println("First element: " + numbers.get(0));

        // Iterating over the ArrayList
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}
