package stringExamples;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int temp = num;
        int numDigits = 0;
        while(temp>0){
            temp= temp/ 10;
            numDigits++;
        }
        int sum=0;
        temp = num;

        while(temp>0){
            int digits = temp% 10;
            sum += Math.pow(digits, numDigits);
            temp/= 10;
        }

        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " not an ArmStrong number");
        }

    }
}
