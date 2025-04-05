package stringExamples;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringToByte {
    public static void main(String[] args){
//        byte[] byte1 = {'T', 'E', 'S', 'T','I','N', 'G'};
//        byte[] byte2 = {83, 117, 114, 115 , 115};
//
//        String str = new String(byte1);
//        String str1 = new String(byte2);
//
//        System.out.println(str);
//        System.out.println(str1);

        String str = "Testing";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));


    }
}
