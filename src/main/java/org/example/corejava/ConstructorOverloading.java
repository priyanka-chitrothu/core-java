package org.example.corejava;

public class ConstructorOverloading {
    ConstructorOverloading(String name, int id) {
        System.out.println("Constructor with two argument" + " String and Integer" + name + " " + id + " ");
    }
    ConstructorOverloading(String name){
        System.out.println("Constructor with one argument" + name);
    }
    ConstructorOverloading(int id){
        System.out.println("Constructor with one argument" + id);
    }

}
class COM{
    public static void main(String[] args){
        ConstructorOverloading S1= new ConstructorOverloading(" John", 76);
        ConstructorOverloading S2 = new ConstructorOverloading("John A");
        ConstructorOverloading S3 = new ConstructorOverloading(34);
    }
}
