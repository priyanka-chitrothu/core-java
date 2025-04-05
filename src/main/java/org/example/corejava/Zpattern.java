package org.example.corejava;

import java.util.Scanner;

public class Zpattern {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows");
//        int rows = sc.nextInt();
//        System.out.print("Enter number of cols");
//        int cols = sc.nextInt();

        for(int i=1; i<=5 ; i++){
            for(int j=1; j<=5 ; j++){
                if(i==1||i==4||i+j== 4){ //  if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
