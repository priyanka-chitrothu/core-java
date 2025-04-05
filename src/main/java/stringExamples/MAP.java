package stringExamples;

import java.util.HashMap;
import java.util.Map;

public class MAP {
    public static void main(String[] args){
        Map<String, Integer> students = new HashMap<>();
        students.put("And", 34);
        students.put("Or", 45);
        students.put("Not", 87);
        students.put("Nor", 45);
        students.put("78", 87);
        students.put("And", 44);

        System.out.println(students.keySet());

        for(String name : students.keySet())
        {

        }


    }
}
