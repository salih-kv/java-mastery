// Class to represent a Person
class Person {
    // Attributes (means properties or characteristics) of the Person class
    // Variables inside a class we generally called as member variables
    String name; // string variable to store name
    int age; // integer variable to store age

    // Constructor to initialize Person object
    // Constructor is a special method in Java
    // It is used to initialize (means assign or store a value) the object of the class
    // It is called automatically when an object of the class is created
    // Constructors have a name and a return type
    // The name of the constructor is the same as the name of the class
    // The return type of the constructor is void
    // We can also have multiple constructors in a class
    // Each constructor has its own name and return type
    public Person(String name, int age) {
        // Assigning values to member variables
        // We can access member variables using the dot operator (.)
        // We can also use the this keyword to refer to the current object
        // this keyword refers to the current object of the class
        // It is used to access member variables and methods of the current object
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("Alice", 30);

        // Displaying person details
        person1.display();
    }
}
