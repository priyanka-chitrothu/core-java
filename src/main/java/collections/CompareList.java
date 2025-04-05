package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareList {
    public static void main(String[] args){
        // sort and then equal
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","E"));
        ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D"));

        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));

        //compare two list -find out the additional elements
        ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D"));
        ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","E"));

        l4.retainAll(l5);
        System.out.println(l5);

        //find out common element

        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java", "c", "php", ".net"));

        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java", "c", "php", "C++"));

        lang1.retainAll(lang2);
        System.out.println(lang1);



    }
}
