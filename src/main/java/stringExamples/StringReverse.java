package stringExamples;

public class StringReverse {
    public static void main(String[] args) {
        String sb = "hello";
        String rev = " ";
        for (int i = sb.length()-1; i >=0; i--) {
          rev = rev + sb.charAt(i);

        }
        System.out.println(rev);
        String sb1 = "world";
        StringBuffer rev1 = new StringBuffer(sb1);
        System.out.print(rev1.reverse());
    }

}