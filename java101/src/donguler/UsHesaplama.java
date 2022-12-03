package donguler;

import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        int sayi , us,total = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        sayi = scanner.nextInt();

        System.out.print("Üs olacak sayıyı sdeçiniz:  ");
        us = scanner.nextInt();


        for (int i = 1 ; i<=us;i++){
            total *= sayi;
        }

        System.out.println(total);


    }
}
