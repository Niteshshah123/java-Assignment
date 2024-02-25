/*Write a java program to find the size of a specified file */

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class qst15 {

    public static void main(String[] args) { 
        String filePath = "C:\\Users\\user\\Desktop\\Assignment\\description.txt";  // Specify the path of the file
        Path path = Paths.get(filePath);

        try {
            long fileSize = Files.size(path);// Get the size of the file in bytes

            // Print the size of the file
            System.out.println("Size of the file " + path.getFileName() + ": " + fileSize + " bytes");
        } catch (IOException e) {
            // Handle file I/O exception
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
