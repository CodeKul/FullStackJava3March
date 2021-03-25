package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("FHDemo2.txt")) {
            fileWriter.write("Today45 is4 Wednesday12 ");
            System.out.println("File write successfully...");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("FHDemo2.txt")) {
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
