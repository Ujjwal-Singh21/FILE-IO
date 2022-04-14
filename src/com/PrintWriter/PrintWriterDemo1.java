package com.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("PrintWriter.txt");
        PrintWriter pw = new PrintWriter(fw);

        //writing some data into file
        pw.write(100); //d
        pw.println(100); //100
        pw.println(true);
        pw.println('c');
        pw.println("Steve");

        pw.flush();
        pw.close();

    }
}
