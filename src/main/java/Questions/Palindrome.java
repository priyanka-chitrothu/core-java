package Questions;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
        char[] arr = {'a', 'b', 'k'};
        boolean isPalindrome = true;
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length -i-1]){
                isPalindrome = false;
                break;

            }
        }
        System.out.print(isPalindrome ? "Palindrome": "Not a Palindrome");


    }
}
