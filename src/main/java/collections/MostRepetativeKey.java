package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostRepetativeKey {
    public static void main(String[] args){
        String S = "repetative";
       // String S ="Looking for a QA job QA Automation";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: S.toCharArray()){
            map.merge(c, 1, Integer::sum);
        }
           Map.Entry<Character, Integer> entry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
           System.out.println(entry.getKey() + ""+ entry.getValue());
    }
}
