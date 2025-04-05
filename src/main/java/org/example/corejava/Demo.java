package org.example.corejava;

public class Demo {
    public static void main(String ar[]){
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // Output: John Doe

        String fullName1 = firstName.concat(" ").concat(lastName);
        System.out.println(fullName1); // Output: John Doe


    }
}
