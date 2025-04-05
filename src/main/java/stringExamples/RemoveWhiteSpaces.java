package stringExamples;

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        String str = " j  a  va s  t a r";
        String str1 =str.replaceAll("\\s","");
        System.out.println(str1);
    }
}
