package stringExamples;

//In an Integer array find as same of two digits using java also give the index of those numbers

import java.util.HashMap;

public class WiproInterview {

    public static void main(String[] args) {
        Integer arr[] = {2, 7, 11, 15, 3, 6};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean found = false;

//        for (int i = 0; i < arr.length; i++) {
//            int complement = target - arr[i];
//            if (map.containsKey(complement)) {
//                System.out.println("pari found" + "" + arr[i] + complement);
//                System.out.println("Index" + " " + map.get(complement));
//                found = true;
//                break;
//            }
//            map.put((arr[i]), i);
//        }
//        if (!found) {
//            System.out.println("No pair found with sum " + target);
//        }
//        System.out.println("---------------");
        for( int j = 0; j < arr.length; j++) {
            for( int k = 0; k < arr.length; k++) {
                 if(arr[j]+arr[k] == target){
                     System.out.println("pari found"+arr[j]+"---"+arr[k]);
                     System.out.println("pari with index"+j+"---"+k);

                     break;
                 }
            }
        }

    }
}
