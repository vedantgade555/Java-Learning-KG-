package FileHandling;

import java.io.FileReader;   // <-- import the real FileReader class
import java.io.IOException;

class FileReaderEx {
    public static void main(String[] args) {
        String filename = "vedant.txt";

        // try-with-resources to auto-close the reader
        try (FileReader reader = new FileReader(filename)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            System.out.printf("Exception occurred: %s", e.getMessage());
        }
    }
}
