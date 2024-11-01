class Car {
    String model;
    int year;

    // Default constructor
    public Car() {
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Car car1 = new Car();                 // Calls default constructor
        Car car2 = new Car("Toyota", 2021);   // Calls parameterized constructor

        car1.display();
        car2.display();
    }
}
