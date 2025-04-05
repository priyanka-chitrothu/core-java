package org.example.StringInterviewQuestions;

import static org.apache.poi.sl.usermodel.TableCell.BorderEdge.left;

public class Palindrome {
//    public static boolean isPalindrome(String str){
//        String rev = new StringBuffer(str).reverse().toString();
//        return rev.equals(str);
//    }
//    public static void main(String[] args){
//        String str = "madam";
//        if (isPalindrome(str)) {
//            System.out.print("is a palindrome:" + str);
//
//        }else{
//            System.out.print("Not a palindrome");
//        }

    public static void main(String[] args){
        String S1= "madam";
        String rev= "";
        int lemgth = S1.length();
        for(int i=0; i<lemgth/2 ; i++){
            if(S1.charAt(i)!= S1.charAt(lemgth-i-1)){
                System.out.print("Not a Palindrome");
            }else{
                System.out.print("Palindrome");
            }
        }


        }
    }

