package com.File;
import java.io.File;

//program to display all files and subDirectories names and count inside C:\Ujjwal
public class DisplayFilesAndDirectories {
    public static void main(String[] args) {

        File file = new File("C:\\Ujjwal");
        String[] s = file.list();
        int count = 0;

        for (String s1 : s) {
            count++;
            System.out.println(s1);
        }

        System.out.println("Total no of Files & subDirectories in C:\\Ujjwal is: " + count);

    }
}
