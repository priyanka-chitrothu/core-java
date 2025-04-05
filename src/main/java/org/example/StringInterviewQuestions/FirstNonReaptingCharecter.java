package org.example.StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReaptingCharecter {
    public static void main(String[] args){
        String S ="aabbbcddeffg";
        Map<Character, Integer> mapcount = new HashMap<>();
        for(char c: S.toCharArray()){
            mapcount.put(c, mapcount.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> entry : mapcount.entrySet()){
            System.out.print(entry.getKey() + ""+ entry.getValue());
            if(entry.getValue()==1){
                entry.getValue();
                System.out.println(" First  Repeating character ");
            }
            else{
                System.out.println("Not exist!");
            }
        }
    }
}
