package Questions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsinArray {
    public static void main(String[] args){
        int[] arr= {10, 10, 30, 10, 40 , 50, 60};
        Set<Integer>  UniqueElements = new HashSet<>();

        for(int num : arr){
            UniqueElements.add(num);
        }
        System.out.println(UniqueElements);
    }
}
