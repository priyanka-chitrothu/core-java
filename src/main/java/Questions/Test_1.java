package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_1 {
    public static void main(String ar[]){
        int[] arr = {10, 20, 30, 80, 50,40};
        // To sort an array
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

        //Arrays to string
        int[] arr1 = {10, 20, 30, 80, 50,40};
        System.out.println(Arrays.toString(arr1));

        //Arrays equals
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {10, 20, 30 };
        System.out.println(Arrays.equals(arr2,arr3));

        //fill array with specific value
        int[] arr4 = new int[4];
        Arrays.fill(arr, 6);
        System.out.println(Arrays.toString(arr4));

        //Copies element from one array to another array with specific length
        int[] arr5 = {20, 30, 40, 50};
       int[] newArr= Arrays.copyOf(arr5, 4);
        System.out.println(Arrays.toString(newArr));

        //converts arrays to list
        String[] arr8 = {"java", "c", "php"};
        List<String> list = Arrays.asList(arr8);
        System.out.println(list);

        //binary search of element
        int[] arr9 = {10, 20, 30, 40};
        int index = Arrays.binarySearch(arr9, 30);
        System.out.print("indexed element is"+ index);



    }
}
