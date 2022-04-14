package com.FileWriter;
import java.io.FileWriter;
import java.io.IOException;

//writing some data into abc.txt file using FileWriter(C) & its 3 overloaded write() methods
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        // -> 1st constructor -> performs Overriding and rewrite over old data
//        FileWriter fw = new FileWriter("abc.txt");
        // -> 3rd constructor -> everytime writes the data again & again
        FileWriter fw = new FileWriter("abc.txt",true);

        fw.write(100); //adding a single character d
        fw.write("urga\nSoftwareSolutions"); //adding a String
        fw.write('\n'); //adding a new Line

        //creating a char[] array
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        fw.write(ch); //adding an array of character
        fw.write('\n'); //adding a new line again

        fw.flush();
        fw.close();
    }
}
