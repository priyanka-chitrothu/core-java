package stringExamples;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args){
    String names[] = {"java", "JavaScript","Ruby", "Python", "C", "java"};

    //1. compare element
//    for(int i =0; i<names.length; i++){
//        for(int j=0; j<names.length; j++){
//            if(names[i].equals(names[j])){
//                System.out.println(names[j]);
//            }
//        }
//    }
//2. using Hashset: java collections stores unique value:o(n)
Set<String> store = new HashSet<>();
    for(String name: names){
        if(!store.add(name)){
            System.out.println(name);
        }
    }
}
}
