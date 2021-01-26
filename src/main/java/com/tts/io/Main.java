package com.tts.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //below is try with resources
        //we can provide a try block with data to refer to in code block
        try (FileInputStream in = new FileInputStream("input.txt");
             FileOutputStream out = new FileOutputStream("output.txt")) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }


            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
//        catch (IOException e){
//            System.out.println("Exception!");
//        } finally {

    //there are multiple ways to handle I/O in the Java API
    //for example, in place Stream types we can use FileReader/FileWriter
    try (FileReader in = new FileReader("input.txt");
    FileWriter out = new FileWriter("output.txt")) {
        System.out.println("Hello there");

    }

}