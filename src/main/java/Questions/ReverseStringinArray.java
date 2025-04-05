package Questions;

public class ReverseStringinArray {
    public static void main(String[] args){
        String[] arr = {"java", "c", "php", "javascript"};
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
