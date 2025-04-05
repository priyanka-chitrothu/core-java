package Questions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementinArray {
    public static void main(String[] args){
        int[] arr ={10, 10 , 20, 20, 30, 40, 50};
        Set<Integer> duplicates = new HashSet<>();
        for(int num: arr){
            if(!duplicates.add(num)){
                System.out.println("found duplicates" + duplicates);
            }
        }
    }
}
