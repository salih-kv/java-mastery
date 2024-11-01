public class OuterClass {
    private String message = "Hello from OuterClass";

    // Inner class
    class InnerClass {
        public void display() {
            System.out.println(message); // Accessing the outer class variable
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
