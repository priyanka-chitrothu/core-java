package stringExamples;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachElement {
    public static void main(String[] args){
        String S1= "Try Programming";
        S1 = S1.replaceAll("\\s", "");
        Map<Character, Integer>  charCount = new HashMap<>();
        for(char c: S1.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }


    }


}
