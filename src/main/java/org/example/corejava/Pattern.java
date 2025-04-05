package org.example.corejava;

public class Pattern {
    public static void main(String[] args){
        int rows = 5;
        for (int i = 5 ; i>=1 ; i--){
            //System.out.print(" row num:"+ i);
            for(int j=0; j<= 5-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("+");
            }
            System.out.println();
        }


    }
}
