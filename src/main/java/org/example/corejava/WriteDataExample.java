package org.example.corejava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteDataExample {
    public static void main(String[] args) throws IOException {
        //Step1: Create an object of Filewritter class

        FileWriter fr = new FileWriter("");

      //  Step2: Create an object of properties of class
        Properties p = new Properties();

        //Step3: use set property/store method to set property
        p.setProperty("url", "rcvacademy.com");
        p.store(fr, "sample comments");


    }
}
