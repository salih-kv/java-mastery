import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
