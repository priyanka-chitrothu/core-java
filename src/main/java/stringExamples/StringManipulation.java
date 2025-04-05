package stringExamples;

public class StringManipulation {
    public static void main(String[] args){
        String s= "Iam a student also QA Engineer";
        String s1= "Iam a student also QA Engineer";
         System.out.println( s.length());

         System.out.println(s.charAt(6));

         System.out.println(s.indexOf('s', s.indexOf('s')+1));

         System.out.println(s.indexOf("also"));

         System.out.println(s.indexOf("QA"));

         System.out.println(s.equals(s1));

         System.out.println(s.equalsIgnoreCase(s1));


    }
}
