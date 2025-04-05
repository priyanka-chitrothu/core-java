package org.example.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {
    public static void main(String[] args) throws IOException {
        // Step1: Create an object of FileReader Class
        //FileReader Fr = new FileReader("C:\\workspace\\ProjectMaven_1\\src\\Note");
        FileInputStream fir = new FileInputStream("C:\\workspace\\ProjectMaven_1\\src\\Note");

        //Step2: Create an object of properties of class
        Properties p = new Properties();

        //Step3: Load the file
        p.load(fir);

        //step4: Use get property method to get property
        System.out.println(p.getProperty("name"));
        //System.out.println(System.getProperty("user.dir"));
    }
}
