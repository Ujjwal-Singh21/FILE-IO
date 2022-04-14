package com.File;
import java.io.File;
import java.io.IOException;

//creating a file inside a directory using 2nd or 3rd constructor
public class FileInsideDirectory {
    public static void main(String[] args) throws IOException {

        //first creating a directory
        File file1 = new File("durga123");
        file1.mkdir();

        //using 2nd constructor creating a new file inside durga123 directory
        File file2 = new File("durga123", "demo1.txt");
        file2.createNewFile();

        //using 3rd constructor creating a new file inside durga123 directory
        File file3 = new File(file1, "demo2.txt");
        file3.createNewFile();


    }
}
