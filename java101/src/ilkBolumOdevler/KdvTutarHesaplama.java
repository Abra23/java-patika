package ilkBolumOdevler;

import java.util.Scanner;

public class KdvTutarHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOrani = 0.18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun Tutarini giriniz: ");
        tutar = scanner.nextDouble();
        double kdvliTutar, kdvTutari = tutar * kdvOrani;
        kdvliTutar = kdvTutari + tutar;
        System.out.println("KDV'li fiyatiniz :  "+kdvliTutar) ;
    }
}
