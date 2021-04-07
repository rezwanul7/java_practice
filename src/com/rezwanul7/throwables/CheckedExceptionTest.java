package com.rezwanul7.throwables;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedExceptionTest {
    public static void main(String[] args) {

//       You should Close the operating system resource at the end
        FileReader reader = null;
        try {
            reader = new FileReader("test.txt");
            int read = reader.read();
            new SimpleDateFormat().parse("aaa");
        }
        catch (IOException | ParseException e) {
            System.out.println("could not read data");
            e.printStackTrace();
        }finally {
            try {
                if (reader!=null) {
                    reader.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        System.out.println("End here..");

    }
}
