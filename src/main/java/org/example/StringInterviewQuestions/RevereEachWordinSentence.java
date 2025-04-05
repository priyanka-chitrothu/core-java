package org.example.StringInterviewQuestions;

public class RevereEachWordinSentence {
    public static void main(String[] args){
        String S1= "Try Coding";
        String[] words= S1.split("//");
        StringBuffer results= new StringBuffer();
        for(String word: words){
            results.append(word).reverse();
        }
        System.out.print(results + " ");

    }
}
