package stringExamples;

public class StringinAlphabeticalOrder {
    public static void main(String[] args){
        String str = "rock";
        char arr[] = str.toCharArray();
        char temp;
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i; j++){
                if(arr[i] > arr[j+1]){
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                //using sort option we can arrange string in Alphabetical order
            }

        }
        System.out.println(new String(arr));
    }
}
