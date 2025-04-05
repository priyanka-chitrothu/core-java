package org.example.corejava;

class  one{
    public void print_lastgeeks(){
        System.out.println("Geeks");
    }
}

class two extends one{
    public void print_for() {
        System.out.println("For");
    }
}

class three extends two{
    public void print_geeks(){
        System.out.println("Geeks");
    }
}



public class Multilevel_Inheritance {
    public static void main(String[] args){
        three P1 = new three();
        P1.print_geeks();
        P1.print_for();
        P1.print_lastgeeks();

    }
}
