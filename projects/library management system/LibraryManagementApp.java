import java.util.ArrayList;
import java.util.Scanner;

// Represents a book in the library
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

// Represents a user of the library
class User {
    private String name;
    private int userId;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }
}

// Library class to manage books and users
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Method to add a new book to the library
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book '" + title + "' added successfully.");
    }

    // Method to register a new user to the library
    public void addUser(String name, int userId) {
        users.add(new User(name, userId));
        System.out.println("User '" + name + "' registered successfully.");
    }

    // Method to borrow a book
    public void borrowBook(String title, int userId) {
        Book book = findBookByTitle(title);
        User user = findUserById(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is currently unavailable.");
            return;
        }

        book.setAvailable(false); // Mark book as borrowed
        System.out.println("Book '" + title + "' borrowed by user '" + user.getName() + "'.");
    }

    // Method to return a book
    public void returnBook(String title) {
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is already available in the library.");
            return;
        }

        book.setAvailable(true); // Mark book as returned
        System.out.println("Book '" + title + "' returned successfully.");
    }

    // Helper method to find a book by title
    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Helper method to find a user by userId
    private User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}

// Main class with user interaction
public class LibraryManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to the Library Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;

                case 2:
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    int userId = scanner.nextInt();
                    library.addUser(name, userId);
                    break;

                case 3:
                    System.out.print("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextInt();
                    library.borrowBook(title, userId);
                    break;

                case 4:
                    System.out.print("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;

                case 5:
                    System.out.println("Exiting the Library Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
