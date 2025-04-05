package Questions;

import net.sf.saxon.functions.Collection;

import java.util.Arrays;
import java.util.Collections;

public class CollectionReverse {
    public static void main(String[] args){
        Integer[] arr = {10,20,30,40};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}
