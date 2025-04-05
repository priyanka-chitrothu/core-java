package org.example.corejava;


class Programmer{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Implementation {
    public static void main(String[] args){
        Programmer P1= new Programmer();
        P1.setName(" John ");
        System.out.println("Name is" + P1.getName());


    }
}
