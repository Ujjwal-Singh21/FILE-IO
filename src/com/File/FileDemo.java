package com.File;
import java.io.File;
import java.io.IOException;

//creating a new File in current working directory
public class FileDemo {
    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");
        System.out.println(file.exists()); //false -> in next run true

        file.createNewFile();

        System.out.println(file.exists()); //true


    }
}
