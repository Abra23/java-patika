package ilkBolumOdevler;

import java.util.Scanner;

public class TaksimetreHesaplama {

    public static void main(String[] args) {
        int acilisUcreti = 10, minOdeme = 20, mesafe;
        double kmBasinaUcret = 2.2, tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyı giriniz : ");
        mesafe = scanner.nextInt();

        tutar = acilisUcreti + (mesafe * kmBasinaUcret);

        String sonuc = tutar >= minOdeme ? ("Toplam ödemeniz : "+tutar+"TL") :("Ödemeniz asgari ödeme şartından dolayı "+minOdeme+"TL")  ;

        System.out.print(sonuc);



    }
}
