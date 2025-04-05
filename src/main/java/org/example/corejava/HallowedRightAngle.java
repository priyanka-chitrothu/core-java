package org.example.corejava;

import java.util.Scanner;

public class HallowedRightAngle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns");
        int cols = sc.nextInt();
        sc.close();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols ; j++){
                if(j==1||i==rows||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
