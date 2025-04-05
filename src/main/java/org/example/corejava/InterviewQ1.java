package org.example.corejava;

import java.util.HashSet;
import java.util.Set;

public class InterviewQ1 {
        public static void main(String[] args) {
            String S1 = "Priyanka@Singaladevi@is@attending@interview";
             String modified = S1.replaceAll("[aeiouAEIOU]", "");
             System.out.println(modified);


        }
}
