package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("FHDemo2.pdf");
            fileWriter.write("Today45 is4 Wednesday12 ");
            System.out.println("File write successfully...");

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
            fileReader = new FileReader("FHDemo2.pdf");
            int i = fileReader.read();

            while (i > 0) {
                if (Character.isDigit((char) i)) {
                    System.out.print((char) i);
                }
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
