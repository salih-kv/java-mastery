import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }

            // Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a file handling example.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Read from the file
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println("File content: " + data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
