class StaticExample {
    // Static variable
    static int count = 0;

    // Static method
    public static void increment() {
        count++;
    }

    public void display() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Calling static method without creating an object
        StaticExample.increment();
        StaticExample.increment();

        StaticExample example = new StaticExample();
        example.display(); // Displays count
    }
}
