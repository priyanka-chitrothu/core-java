package stringExamples;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    public static void main(String[] args){
        Set<Integer> nums = new HashSet<>();
        nums.add(32);
        nums.add(45);
        nums.add(65);
        nums.add(43);
        nums.add(43);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());


//        for(int n: nums){
//            System.out.println(n);
//        }
    }
}
//prints values in random order
//Doesn't allows duplicate
// if want to print values in set in sorted list that can be done with "Tree set"