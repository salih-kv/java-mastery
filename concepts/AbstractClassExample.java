// Abstract class
abstract class Shape {
    // Abstract method (no implementation here)
    public abstract void draw();

    // Regular method
    public void description() {
        System.out.println("This is a shape");
    }
}

// Subclass (provides implementation of draw method)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();          // Calls Circle's draw method
        shape.description();    // Calls Shape's description method
    }
}
