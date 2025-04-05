package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args){
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("java");
        ar1.add("C");
        ar1.add("Python");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("ruby");
        ar2.add("C++");
        ar2.add("php");

        System.out.println(ar1.addAll(ar2));

        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("tom", "tom", "tom", "Java", "Java"));
        nameList.retainAll(Collections.singletonList("tom"));
        System.out.println(nameList);

        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> sublist = new ArrayList<Integer>(numbers1.subList(2,6));
        System.out.println(sublist);


    }
}
