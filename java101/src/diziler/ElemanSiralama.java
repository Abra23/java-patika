package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanSiralama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Dizi ka� elemanl� olacak => " );
        int count = scanner.nextInt();

        int[] list = new int[count];


        for (int i = 0; i < list.length; i++){
            System.out.println((i+1)+". eleman� giriniz: ");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));



    }

}
