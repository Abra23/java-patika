package donguler;

import java.util.Scanner;

public class GirilenSayilardanMinMax {
    public static void main(String[] args) {

        int adet , sayi  , enBuyuk = 0 , enKucuk = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz => ");
        adet = scanner.nextInt();

        for(int i = 1; i <= adet;i++ ){
            System.out.print(i + ".sayıyı giriniz =>  ");
            sayi = scanner.nextInt();

            if(i == 1){
                enBuyuk = sayi;
                enKucuk = sayi;
            }

            if(sayi > enBuyuk){
                enBuyuk = sayi;
            }

            else if (sayi < enKucuk){
                enKucuk = sayi;
            }
        }

        System.out.println("En buyuk sayi => "+enBuyuk);
        System.out.print("En buyuk sayi => "+enKucuk);


    }
}
