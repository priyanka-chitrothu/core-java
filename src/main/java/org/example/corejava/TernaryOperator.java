package org.example.corejava;

public class TernaryOperator {
    public static void main(String[] args){
        //variable = (Condition)? trueExpression : FalseExpression
        int num1 = 20;
        int num2 = 40;
        if(num1>num2) {
            System.out.println("Num1>Num2");
        }
        else {
            System.out.println("Num1<Num2");
        }
        String result =(num1>num2)?"Num1>Num2": "Num1<Num2";
        System.out.println(result);
    }
}
