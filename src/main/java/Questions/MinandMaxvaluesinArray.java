package Questions;

public class MinandMaxvaluesinArray {
    public static void main(String[] args){
        int[] arr ={10, 20, 5, 60, 40, 90};
        int max = arr[0];
        int min = arr[0];
        for(int i =0 ; i<=arr.length-1; i++){
            if(max>arr[i]){
                max= arr[i];
            }
            if(min<arr[i]){
                min = arr[i];
            }


        }
        System.out.print("max:"+ max +" "+ "min"+ min);
    }
}
