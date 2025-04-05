package org.example.corejava;

public class Inheritance {
    String Salary = "86000" ;
}
class ChildClass extends Inheritance{
    int benefits = 60000 ;
}

class Ghf{
    public static void main(String[] args){
        ChildClass E1 = new ChildClass();
        System.out.println("Salary:" + E1.Salary + "\nBenefits:" + E1.benefits);
    }
}
