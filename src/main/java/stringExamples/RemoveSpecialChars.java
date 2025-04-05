package stringExamples;

public class RemoveSpecialChars {
    public static void main(String[] args){
        String str = "$jav!!#$^a";
        String plainstr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainstr);
    }
}
