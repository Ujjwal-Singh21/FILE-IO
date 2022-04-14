package com.FileReader;
import java.io.FileReader;
import java.io.IOException;

// A simple example of FileReader that helps us to read characters from a File
// Using 1st read() method
public class FileReaderDemo1 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("FileReader.txt");

        int i = fr.read(); // i -> unicode value of every character

        while (i != -1) {

            System.out.print((char) i);

            i = fr.read();
        }
    }
}
