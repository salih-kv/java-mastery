class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference and object
        Animal myCat = new Cat();        // Animal reference, Cat object
        Animal myDog = new Dog();        // Animal reference, Dog object

        myAnimal.sound();
        myCat.sound();   // Calls Cat's version of sound
        myDog.sound();   // Calls Dog's version of sound
    }
}
