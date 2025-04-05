package listeners;

//Difference between String Literal and String Object

public class StringExample {
    public static void main(String[] args){
        String str1 = "RCV";
        String str2 = "RCV";
        String str3 = new String("RCV");
        System.out.println(str1 == str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
