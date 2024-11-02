import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Book {
    String title, author;
    boolean isAvailable = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class User {
    String name;
    int userId;

    User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }
}

// JFrame - class provided by swing to create windows
// ActionListener - interface from the Java Swing library that listens for user actions like button clicks.
public class LibraryManagementSystemGUI extends JFrame implements ActionListener {
    // private means - only accessible within this class
    // books ArrayList store book objects
    // <Book> part tells Java that only Book objects can be stored in this list.
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    
    // JTextField - Swing component that allows users to enter a single line of text.
    // bookTitleField, bookAuthorField, etc are all field names
    private JTextField bookTitleField, bookAuthorField, userNameField, userIdField, borrowTitleField, returnTitleField;
    // JTextArea - Swing component that allows multiple lines of text, unlike JTextField
    private JTextArea outputArea;

    // VERTICAL LAYOUT
    // public LibraryManagementSystemGUI() {
    //     // Sets the title of the application window to “Library Management System,” 
    //     // which will appear in the window's title bar.
    //     setTitle("Library Management System");
    //     // Sets the size of the window to be 800 pixels wide and 600 pixels tall.
    //     setSize(800, 600);
    //     // Specifies what happens when the user closes the window. 
    //     // EXIT_ON_CLOSE tells the program to terminate the application completely when the window is closed.
    //     setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    //     JPanel panel = new JPanel();
    //     panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    //     // Add Book Section
    //     panel.add(new JLabel("Add Book"));
    //     bookTitleField = new JTextField(15);
    //     bookAuthorField = new JTextField(15);
    //     panel.add(new JLabel("Title:"));
    //     panel.add(bookTitleField);
    //     panel.add(new JLabel("Author:"));
    //     panel.add(bookAuthorField);
    //     JButton addBookButton = new JButton("Add Book");
    //     addBookButton.addActionListener(this);
    //     panel.add(addBookButton);

    //     // Register User Section
    //     panel.add(new JLabel("Register User"));
    //     userNameField = new JTextField(15);
    //     userIdField = new JTextField(15);
    //     panel.add(new JLabel("Name:"));
    //     panel.add(userNameField);
    //     panel.add(new JLabel("User ID:"));
    //     panel.add(userIdField);
    //     JButton registerUserButton = new JButton("Register User");
    //     registerUserButton.addActionListener(this);
    //     panel.add(registerUserButton);

    //     // Borrow Book Section
    //     panel.add(new JLabel("Borrow Book"));
    //     borrowTitleField = new JTextField(15);
    //     panel.add(new JLabel("Book Title:"));
    //     panel.add(borrowTitleField);
    //     JButton borrowBookButton = new JButton("Borrow Book");
    //     borrowBookButton.addActionListener(this);
    //     panel.add(borrowBookButton);

    //     // Return Book Section
    //     panel.add(new JLabel("Return Book"));
    //     returnTitleField = new JTextField(15);
    //     panel.add(new JLabel("Book Title:"));
    //     panel.add(returnTitleField);
    //     JButton returnBookButton = new JButton("Return Book");
    //     returnBookButton.addActionListener(this);
    //     panel.add(returnBookButton);

    //     // Output Area
    //     // 10 rows and 40 columns.
    //     outputArea = new JTextArea(10, 40);
    //     // Makes the outputArea read-only so that it only displays messages without allowing users to type into it.
    //     outputArea.setEditable(false);
    //     // allowing scrolling if the text exceeds the visible area.
    //     panel.add(new JScrollPane(outputArea));

    //     // Adds the panel (containing all labels, fields, and buttons) to the main JFrame window. 
    //     // This line effectively displays the UI components when the application runs.
    //     add(panel);
    // }

    public LibraryManagementSystemGUI() {
        setTitle("Library Management System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Use GridBagLayout for a flexible grid-based layout.
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Define padding and insets for components
        gbc.insets = new Insets(10, 10, 10, 10); // Top, left, bottom, right
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Panel for adding books
        JPanel addBookPanel = createPanel("Add Book");
        gbc.gridx = 0; // First column
        gbc.gridy = 0; // First row
        add(addBookPanel, gbc);

        // Panel for registering users
        JPanel registerUserPanel = createPanel("Register User");
        gbc.gridx = 1; // Second column
        gbc.gridy = 0; // First row
        add(registerUserPanel, gbc);

        // Panel for borrowing books
        JPanel borrowBookPanel = createPanel("Borrow Book");
        gbc.gridx = 0; // First column
        gbc.gridy = 1; // Second row
        add(borrowBookPanel, gbc);

        // Panel for returning books
        JPanel returnBookPanel = createPanel("Return Book");
        gbc.gridx = 1; // Second column
        gbc.gridy = 1; // Second row
        add(returnBookPanel, gbc);

        // Output Area
        outputArea = new JTextArea(10, 64);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        JPanel outputPanel = new JPanel(new BorderLayout());
        outputPanel.add(new JLabel("Messages:"), BorderLayout.NORTH);
        outputPanel.add(scrollPane, BorderLayout.CENTER);
        outputPanel.setBorder(BorderFactory.createTitledBorder("Output")); // Titled border for clarity

        gbc.gridwidth = 2; // Span both columns
        gbc.gridx = 0; // First column
        gbc.gridy = 2; // Third row
        gbc.weighty = 1.0; // Allow the output panel to take up extra vertical space
        add(outputPanel, gbc);

        // Pack and display
        pack();
        setVisible(true);
    }

    private JPanel createPanel(String title) {
     JPanel panel = new JPanel();
     panel.setLayout(new BorderLayout());
     panel.setBorder(BorderFactory.createTitledBorder(title));

     JPanel fieldsPanel = new JPanel();
     fieldsPanel.setLayout(new GridLayout(2, 1));

     JTextField titleField = new JTextField(15);
     JTextField authorField = new JTextField(15);

     if (title.equals("Add Book")) {
         bookTitleField = titleField;  // Assign to instance variable
         bookAuthorField = authorField; // Assign to instance variable

         fieldsPanel.add(new JLabel("Title:"));
         fieldsPanel.add(bookTitleField);
         fieldsPanel.add(new JLabel("Author:"));
         fieldsPanel.add(bookAuthorField);
         JButton addBookButton = new JButton("Add Book");
         addBookButton.addActionListener(this);
         panel.add(fieldsPanel, BorderLayout.CENTER);
         panel.add(addBookButton, BorderLayout.SOUTH);
     } else if (title.equals("Register User")) {
         userNameField = titleField; // Assign to instance variable
         userIdField = authorField; // Assign to instance variable

         fieldsPanel.add(new JLabel("Name:"));
         fieldsPanel.add(userNameField);
         fieldsPanel.add(new JLabel("User ID:"));
         fieldsPanel.add(userIdField);
         JButton registerUserButton = new JButton("Register User");
         registerUserButton.addActionListener(this);
         panel.add(fieldsPanel, BorderLayout.CENTER);
         panel.add(registerUserButton, BorderLayout.SOUTH);
     } else if (title.equals("Borrow Book")) {
         borrowTitleField = titleField; // Assign to instance variable

         fieldsPanel.add(new JLabel("Book Title:"));
         fieldsPanel.add(borrowTitleField);
         JButton borrowBookButton = new JButton("Borrow Book");
         borrowBookButton.addActionListener(this);
         panel.add(fieldsPanel, BorderLayout.CENTER);
         panel.add(borrowBookButton, BorderLayout.SOUTH);
     } else if (title.equals("Return Book")) {
         returnTitleField = titleField; // Assign to instance variable

         fieldsPanel.add(new JLabel("Book Title:"));
         fieldsPanel.add(returnTitleField);
         JButton returnBookButton = new JButton("Return Book");
         returnBookButton.addActionListener(this);
         panel.add(fieldsPanel, BorderLayout.CENTER);
         panel.add(returnBookButton, BorderLayout.SOUTH);
     }
     return panel;
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Add Book":
               addBook();
               break;
            case "Register User":
                registerUser();
                break;
            case "Borrow Book":
                borrowBook();
                break;
            case "Return Book":
                returnBook();
                break;
        }
    }

    private void addBook() {
        String title = bookTitleField.getText();
        String author = bookAuthorField.getText();
        if (title.isEmpty() || author.isEmpty()) {
            outputArea.append("Please enter book title and author.\n");
            return;
        }
        books.add(new Book(title, author));
        outputArea.append("Book added: " + title + " by " + author + "\n");
    }

    private void registerUser() {
        String name = userNameField.getText();
        int userId;
        try {
            userId = Integer.parseInt(userIdField.getText());
        } catch (NumberFormatException ex) {
            outputArea.append("Invalid User ID.\n");
            return;
        }
        users.add(new User(name, userId));
        outputArea.append("User registered: " + name + "\n");
    }

    private void borrowBook() {
        String title = borrowTitleField.getText();
        Book book = books.stream().filter(b -> b.title.equals(title) && b.isAvailable).findFirst().orElse(null);
        if (book == null) {
            outputArea.append("Book unavailable or not found.\n");
        } else {
            book.isAvailable = false;
            outputArea.append("Book borrowed: " + title + "\n");
        }
    }

    private void returnBook() {
        String title = returnTitleField.getText();
        Book book = books.stream().filter(b -> b.title.equals(title) && !b.isAvailable).findFirst().orElse(null);
        if (book == null) {
            outputArea.append("Book not found or already returned.\n");
        } else {
            book.isAvailable = true;
            outputArea.append("Book returned: " + title + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LibraryManagementSystemGUI app = new LibraryManagementSystemGUI();
            app.setVisible(true);
        });
    }
}
