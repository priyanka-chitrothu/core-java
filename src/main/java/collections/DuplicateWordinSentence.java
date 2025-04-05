package collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordinSentence {
//    public static void main(String[] args) {
//        // Input sentence
//        String sentence = "Java is fun and Java is powerful";
//
//        // Convert to lowercase and split into words
//        String[] words = sentence.toLowerCase().split(" ");
//
//        // Create a HashMap to count word occurrences
//        HashMap<String, Integer> wordCount = new HashMap<>();
//
//        // Count occurrences of each word
//        for (String word : words) {
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        // Print duplicate words
//        System.out.println("Duplicate words:");
//        for (String word : wordCount.keySet()) {
//            if (wordCount.get(word) > 1) {
//                System.out.println(word + " : " + wordCount.get(word));
//            }
//        }
//    }
//
//}
//
//
//public class DuplicateWords {
    public static void main(String[] args) {
        String Sentence = "Java Java Java is a programing La";
        String[] words = Sentence.toLowerCase().split(" ");
        Map<String,Integer> mapCount = new HashMap<>();
        Integer count = 0;
        for(String word: words){
          //  mapCount.put(word, mapCount.getOrDefault(word,0)+1) ;
            if(mapCount.containsKey(word)){
                count = mapCount.get(word);
                mapCount.put(word, count+1) ;
            }else{
                mapCount.put(word,1);
            }
        }
        System.out.print(mapCount);

    }
}

