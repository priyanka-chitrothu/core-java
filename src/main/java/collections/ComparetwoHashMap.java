package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ComparetwoHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(2, "B");
        map2.put(3, "C");
        map2.put(4, "D");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");

        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        //compare hash map values for the same keys:keysSet()
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map2.keySet().equals(map3.keySet()));
        //find out extra key

        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(2, "B");
        map3.put(3, "C");
        map4.put(4, "E");

        //combine the keys from both the maps : using HashSet:

        HashSet<Integer> combinekeys = new HashSet<>(map1.keySet());
        combinekeys.addAll(map4.keySet());
        combinekeys.removeAll(map1.keySet());
        System.out.println(combinekeys);

        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");

        HashMap<Integer, String> map6 = new HashMap<Integer, String>();
        map6.put(1, "A");
        map6.put(2, "B");
        map6.put(3, "C");

        HashMap<Integer, String> map7 = new HashMap<Integer, String>();
        map7.put(1, "A");
        map7.put(2, "B");
        map7.put(3, "C");

        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
        System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map7.values())));

        System.out.println(map1.keySet().equals(map2.keySet()));





    }
}
