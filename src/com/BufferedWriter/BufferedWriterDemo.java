package com.BufferedWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("BufferedWriter.txt", true);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(100); //d
        bw.newLine();

        char[] charArray = {'h', 'e', 'e', 'l', 'o'};

        bw.write(charArray);
        bw.newLine();

        bw.write("Durga");
        bw.newLine();

        bw.write("Software Solutions");

        bw.flush();
        bw.close();
    }
}
