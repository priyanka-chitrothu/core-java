package org.example.corejava;

abstract class Remote {
    abstract  void turnOn();
    abstract  void turnOff();
}

class Tv extends Remote{
    @Override
    void turnOn() {
        System.out.println(" Turn On TV");
    }

     @Override
     void turnOff() {
        System.out.println(" Turn OFF Tv");
    }
}

public class Abstract{
    public static void main(String[] args){
        Remote R1 = new Tv();
        R1.turnOn();
        R1.turnOff();

    }
}


