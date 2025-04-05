package stringExamples;

public class ReverseanInteger {
    public static void main(String[] args){
        int num = 1234;
        int rev =0;
        while(num!=0){
            rev = rev*10+ num%10;
            num = num/10;
        }
        System.out.println(rev);

        long num1 =12345678;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
