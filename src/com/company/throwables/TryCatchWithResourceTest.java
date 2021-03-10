package com.company.throwables;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TryCatchWithResourceTest {
    public static void main(String[] args) {

//       You should Close the operating system resource at the end
// AutoClosable
        try (
                FileReader reader = new FileReader("test1.txt");
                FileWriter writer = new FileWriter("test2.text")
        ) {
            int read = reader.read();
            new SimpleDateFormat().parse("aaa");
        } catch (IOException | ParseException e) {
            System.out.println("could not read data");
            e.printStackTrace();
        }

        System.out.println("End here..");

    }
}
