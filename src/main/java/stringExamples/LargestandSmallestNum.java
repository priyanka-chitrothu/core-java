package stringExamples;

public class LargestandSmallestNum {
    public static void main(String[] args) {
        int number[] = {-10, 24, 50, -88, 98765};

        int largest = number[0];
        int smallest = number[0];


        int i;
        for (i = 0; i < number.length;i++){
            if(number[i]> largest){
                largest = number[i];
            }
            if(number[i]> smallest){
                smallest = number[i];
            }


        }
        System.out.println(largest+" " +smallest);

    }

}
