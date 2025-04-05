package stringExamples;

//How do you reverse each word in a string without reversing the whole sentence? (e.g., "Try coding" → "yrT gnidoc")
public class ReverseEachWord {
    public static void main(String[] args){
       // String S1= "Try Coding";
        String S1 = "Welcome to Capgemini Family";
        System.out.println("Original"+ S1);
        System.out.println("Reversed Words" + reverseEachWord(S1));
    }
    public static String reverseEachWord(String str){
        String[]  words = str.split(" ");
        StringBuilder results = new StringBuilder();
        for(String word: words){
            results.append(new StringBuilder(word).reverse());
        }


        return results.toString().trim();
    }
}

