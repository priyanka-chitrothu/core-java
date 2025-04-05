package collections;

public class WrapperDemo {
    public static void main(String[] args){
        int i = 10;
        Integer int1 = new Integer(i); // Wrapping
        System.out.println(int1);

        int j = int1 ; //Un Wrapping
        System.out.println(j);


    }
}
