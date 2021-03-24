package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("FHDemo2.txt");
            fileWriter.write("Today is Wednesday");
            System.out.println("File write successfully...");
            fileWriter.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("FHDemo2.txt");
            int i = fileReader.read();

            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}
