// Java program to demonstrate inheritance

// Base class
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to describe the animal sound
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

// Derived class (Dog inherits from Animal)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the superclass (Animal) constructor
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Calls the overridden method in Dog class
    }
}
