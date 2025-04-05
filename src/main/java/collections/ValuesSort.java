package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ValuesSort {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<Integer>();
        values.add(3);
        values.add(99);
        values.add(32);
        values.add(42);

        Collections.sort(values);
        values.forEach(System.out::println); //Stream API ...Lambada Expression

        //values.add(1,9);

//        for(int i: values){
//            System.out.println(i);
//        }
    }
}
