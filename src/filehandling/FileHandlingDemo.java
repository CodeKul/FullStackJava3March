package filehandling;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {

        try {
            File file = new File("/home/vaibhav/workspace/JavaFullStack3March/src/filehandling/FHDemo1.txt");
            FileOutputStream fileOutputStream =
                    new FileOutputStream(file);
            String str = "Today is Wednesday and time is 18:13";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            System.out.println("File write successfully...");

            fileOutputStream.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


        try {
            FileInputStream fileInputStream =
                    new FileInputStream("/home/vaibhav/workspace/JavaFullStack3March/src/filehandling/FHDemo1.txt");
            int i = fileInputStream.read();

            while (i>0){
                System.out.print((char)i);
                i = fileInputStream.read();
            }

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    }
}
