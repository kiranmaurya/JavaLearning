package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileFind {
    public static void main(String[] args)  {
        try {
            //teset
            // Try to open a file that may not exist
            FileReader f = new FileReader("kiran.txt");
           // new FileReader("kiran.txt");
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found!");

        }
    }
}
