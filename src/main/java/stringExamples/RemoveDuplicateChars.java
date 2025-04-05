package stringExamples;

public class RemoveDuplicateChars {
    public static void main(String[] args){
        String str = "Programming";
//        StringBuilder sb2 = new StringBuilder();
//        for(int i=0;i<str.length(); i++){
//            char ch = str.charAt(i);
//            int indx = str.indexOf(ch, i+1);
//            if(indx==-1){
//                sb2.append(ch);
//            }
//        }
//        System.out.println(sb2);

        //Approach 3
        char[] arr = str.toCharArray();
        StringBuilder sb3 = new StringBuilder();
        for(int i=0; i< arr.length; i++){
            boolean repeated = true;
            for(int j =i+1; j< arr.length-1; j--){
                if(arr[i]== arr[j]){
                    break;
                }
                if(!repeated){
                     sb3.append(arr[i]);
                }

            }
            System.out.println(sb3.append(arr[i]));
        }
    }

}
