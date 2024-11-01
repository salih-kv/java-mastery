// Define an interface
interface Printable {
    void print();
}

// Implement the interface in a class
class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Printable printable = new Document();
        printable.print(); // Calls the print method in Document class
    }
}

// Example 2

// interface Vehicle {
//     // Abstract method
//     void drive();

//     // Default method with implementation
//     default void honk() {
//         System.out.println("Honking!");
//     }
// }

// class Car implements Vehicle {
//     public void drive() {
//         System.out.println("Driving a car");
//     }
// }

// public class InterfaceExample {
//     public static void main(String[] args) {
//         Vehicle myCar = new Car();
//         myCar.drive();
//         myCar.honk(); // Calls the default method in the interface
//     }
// }

