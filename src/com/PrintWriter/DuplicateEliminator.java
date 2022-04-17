package com.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateEliminator {

    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter("OutputFile.txt");

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("InputFile.txt"));
        String line = bufferedReader1.readLine();

        while (line != null) {

            boolean available = false;
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("OutputFile.txt"));
            String target = bufferedReader2.readLine();

            while (target != null) {

                if (line.equals(target)) {
                    available = true;
                    break;
                }

                target = bufferedReader2.readLine();
            }

            if (!available) {
                printWriter.println(line);
                printWriter.flush();
            }

            line = bufferedReader1.readLine();
        }

        bufferedReader1.close();
        printWriter.close();
    }
}
