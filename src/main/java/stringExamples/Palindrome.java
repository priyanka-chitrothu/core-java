package stringExamples;

public class Palindrome {
    public static boolean isPalindrome(String str){
        String rev = new StringBuffer(str).reverse().toString();
        return rev.equals(str);
    }
    public static void main(String[] args) {
        String[] str = {"madam", "nitin", "arar"};
        for (int i = 0; i <= str.length-1; i++) {
            if (isPalindrome(str[i])) {
                System.out.println("is a palindrome:"+ str[i] );
            } else {
                System.out.println("Not a palindrome"+ str[i]);
            }
        }
    }

}
