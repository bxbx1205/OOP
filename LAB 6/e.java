//6E
//Create a file 

import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String args[]) {
        try {
            // Creating an object of a file with proper file path
            File f0 = new File("D:\\FileOperationExample.txt");  // Use double backslashes in file path

            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is created successfully.");
            } else {
                System.out.println("File already exists in the directory.");
            }

        } catch (IOException exception) {
            System.out.println("An unexpected error occurred.");
            exception.printStackTrace();  // Printing the full stack trace for debugging
        }
    }
}