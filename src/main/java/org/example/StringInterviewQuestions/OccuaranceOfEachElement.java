package org.example.StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class OccuaranceOfEachElement {
    public static void main(String[] args) {
        String S = "Programming";
        S= S.replaceAll("\\s","");
        Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
        for(char c: S.toCharArray()){
            mapCount.put(c, mapCount.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer>  entry: mapCount.entrySet()){
            System.out.println(entry.getKey() + ""+ entry.getValue());
            if(entry.getValue()==1){
                entry.getValue();
                System.out.print(" First  Repeating character ");
            }
            else{
                System.out.print("Not exist!");
            }

        }
    }

}
