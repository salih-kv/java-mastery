import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using streams to filter and print names starting with 'A'
        names.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(System.out::println);
    }
}
