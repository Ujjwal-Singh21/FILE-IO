package com.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerger1 {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("File3.txt");

        BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
        String line = br.readLine();

        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("File2.txt"));
        line = br.readLine();

        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();

        br.close();
        pw.close();
    }
}
