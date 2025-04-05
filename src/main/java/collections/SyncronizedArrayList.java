package collections;

import lombok.Synchronized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncronizedArrayList {
    public static void main(String[] args){
        List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
        nameList.add("Java");
        nameList.add("C");
        nameList.add("Php");

        synchronized(nameList){
            Iterator<String> it = nameList.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

        }
    }
}
