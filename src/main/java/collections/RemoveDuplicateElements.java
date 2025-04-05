package collections;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {
    public static void main(String[] args){
        //ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,23,3,4,4,5,5,6));
        ArrayList<String> Words = new ArrayList<String>(Arrays.asList("Mango", "Mango","Banana"));

        //1. LinkedHashset
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(Words);
        ArrayList<String> nonDuplicateValues = new ArrayList<String>(linkedHashSet);
        System.out.println(nonDuplicateValues);
    }
}
