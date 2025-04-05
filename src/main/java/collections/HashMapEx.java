package collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
    public static void main(String[] args){
        HashMap<String, String> captialMap = new HashMap<String , String>();
        captialMap.put("India", "New Delhi");
        captialMap.put("US", "London1");
        captialMap.put("UK", "London");
        captialMap.put("Null", "Berlin");
        captialMap.put("Null", "LA");

        System.out.println(captialMap.get("USA"));
        System.out.println(captialMap.get("UK"));
        System.out.println(captialMap.get(null));

        Iterator<String> it = captialMap.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = captialMap.get(key);
            System.out.println("Key = "+key + "value = " +value);
        }




    }
}
