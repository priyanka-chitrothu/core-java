package collections;

import java.util.*;

public class ConvertHashMaptoArrayList {
    public static void main(String[] args){
        HashMap<String, Integer> comMap = new HashMap<String, Integer>();
        comMap.put("List", 1000);
        comMap.put("ArrayList", 2000);
        comMap.put("LinkedList", 3000);

        System.out.println("com Map size" + comMap.size());
        Iterator it = comMap.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry)it.next();
           System.out.println(pairs.getKey()+ "=" + pairs.getValue());
       }

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(comMap.entrySet());
        System.out.println(list);
    }
}
