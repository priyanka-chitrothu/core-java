package stringExamples;

public class StringtoCharArray {
    public static void main(String[] args){
        String str1 ="Testing";
        char[] chars = str1.toCharArray();
        System.out.println(chars.length);
        char c = str1.charAt(2);
        System.out.println(c);
    }
}
