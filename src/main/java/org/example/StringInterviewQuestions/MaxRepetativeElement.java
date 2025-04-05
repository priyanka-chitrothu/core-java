package org.example.StringInterviewQuestions;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxRepetativeElement {
    static void main(String[] args) {
        String S1 = "Programmin";
        Map<Character, Integer> mapcount = new HashMap<>();
        int maxCount = 0;
        char mostRepeatedChar =' ';
        for (char c : S1.toCharArray()) {
            mapcount.put(c, mapcount.getOrDefault(c, 0) + 1);
            if (mapcount.get(c) > maxCount) {
                maxCount = mapcount.get(c);
                mostRepeatedChar = c;
            }
            System.out.print(mostRepeatedChar);
        }
    }
}
