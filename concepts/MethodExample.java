// Read the comments in the code to understand the code

public class MethodExample {
    // Function/Method to add two integers
    // here, the add function takes 2 arguments, a and b, and returns the sum of a and b
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method/function to add three integers
    // here, the add function takes 3 arguments, a, b, and c, and returns the sum of a, b, and c
    // eg:- add(5, 10, 15) returns 30
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // main method (we can call this method or function, both are same)
    // main method returns nothing(void), it doesn't return any value
    // it just prints the output in this case
    // String[] args is an array of Strings, it is used to pass arguments to the main method
    // we are not calling the main method here, we are just declaring it
    // the main method is the entry point of the program
    // it is the first method that is executed when the program is run
    // it is also the only method that can be called from outside the class
    // this method/function is called by the JVM(Java Virtual Machine)
    // we (programmer) no need to call this method/function, JVM does it for us
    public static void main(String[] args) {
       // Creating an object of the class MethodExample
       //  eg:- Animal cat = new Animal();
        MethodExample example = new MethodExample();

        // Calling the add method with two parameters
        // here the add returns the sum value and it will print here
        System.out.println("Sum of 5 and 10: " + example.add(5, 10));

        // Calling the overloaded add method with three parameters
        System.out.println("Sum of 5, 10, and 15: " + example.add(5, 10, 15));

        // we can also write like this
        int result = example.add(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + result);

        // or we can write like this
        // the add function returned value is stored in the variable sum
        int sum = example.add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum);
    }
}
