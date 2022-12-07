package diziler;

import java.util.Arrays;

public class ElemanFrekans {
    public static void main(String[] args) {


        int[] arr = {10,20,20,10,10,20,5,20,5,9,9,5};
        Arrays.sort(arr);


        int counter = 0;
        int tempNum = arr[0];

        System.out.println("Tekrar Sayýlarý");

        for (int i = 0; i<arr.length; i++){
            if ( i==0 || tempNum!=arr[i] ){
                for (int j : arr){
                    if (j == arr[i]){
                        counter++;
                        tempNum = arr[i];
                    }
                }

                System.out.println(arr[i]+" sayýsý " + counter+" kere tekrar etti.");
                counter=0;
            }
        }



    }
}
