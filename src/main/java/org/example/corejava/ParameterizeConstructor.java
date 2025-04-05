package org.example.corejava;

public class ParameterizeConstructor {
    String name;
    int id;
    ParameterizeConstructor(String name, int id){
        this.name= name;
        this.id= id;

    }
}
 class ABC{
    public static void main(String[] args){
        ParameterizeConstructor S1= new ParameterizeConstructor("John", 34);
        System.out.print(" S1 name: "+ S1.name + " S1 id: "+ 34);

    }

 }