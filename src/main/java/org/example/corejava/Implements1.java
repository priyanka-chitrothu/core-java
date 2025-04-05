package org.example.corejava;


 class Person{
     String name;
     int id;

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getId(){
         return id;
     }
 }
public class Implements1 {
     public static void main(String[] args){
         Person P1 = new Person();
         P1.setId(45);
         System.out.println("Age :" + P1.getId());
         P1.setName("John");
         System.out.println("Name :" + P1.getName());

     }
}
