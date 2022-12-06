package diziler;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinMaxMin {

    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -788, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayýyý Giriniz => ");
        int girilenSayi = scanner.nextInt();

        int[] numbers2 = new int[numbers.length+1];
        numbers2[0] = girilenSayi;


        for (int i = 0; i < numbers.length; i++){
            numbers2[i+1] = numbers[i];

        }

        Arrays.sort(numbers2);
        int index = Arrays.binarySearch(numbers2,girilenSayi);
        System.out.println("Girilen sayýnýn sýralanmýþ dizideki index no => "+index);



        String kucukSayi = numbers2.length >= index + 1 ? "Girdiðiniz sayý dizideki en küçük sayidir":("Girilen sayýdan küçük en yakýn sayi => " +numbers2[index-1]);
        System.out.println(kucukSayi);

        String buyukSayi =  numbers2.length <= index+1 ? "Girdiðiniz sayý dizideki en büyük sayidir" :("Girilen sayýdan büyük en yakýn sayi => " +numbers2[index+1]);
        System.out.println(buyukSayi);

        System.out.println(Arrays.toString(numbers2));

    }

}
