package com.FileReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//using 2nd read() method
public class FileReaderDemo2 {

    public static void main(String[] args) throws IOException {

        File f = new File("FileReader.txt");

        char[] ch = new char[(int) f.length()];

        FileReader fr = new FileReader(f);
        fr.read(ch);

        //finally printing
        for (char ch1 : ch) {
            System.out.print(ch1);
        }

        fr.close();
    }
}
