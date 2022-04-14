package com.File;
import java.io.File;

//display only SubDirectories present  in C:\Ujjwal
public class DisplayOnlySubDirectories {
    public static void main(String[] args) {

        File file1 = new File("C:\\Ujjwal");
        String[] s = file1.list();
        int count = 0;

        for (String s1 : s) {

            File file2 = new File(file1, s1);

            //returns TRUE for CapgeminiProjects,Others,Studies -> because they are Subdirectories
            //returns FALSE for DummyFile1.text,DummyFile2.text,DummyFile3.text
            if (file2.isDirectory()) {
                count++;
                System.out.println(s1);
            }
        }

        System.out.println("Total no of only SubDirectories in C:\\Ujjwal is: " + count);
    }
}
