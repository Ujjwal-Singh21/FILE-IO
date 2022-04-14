package com.File;
import java.io.File;

//creating a new Directory in current working directory
public class DirectoryDemo {
    public static void main(String[] args) {

        File file = new File("Ujjwal123");
        System.out.println(file.exists());//false -> in next run true

        file.mkdir();

        System.out.println(file.exists());//true
    }
}
