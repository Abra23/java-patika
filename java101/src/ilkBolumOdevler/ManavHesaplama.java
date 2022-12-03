package ilkBolumOdevler;

import java.util.Scanner;

public class ManavHesaplama {
    public static void main(String[] args) {
        double elmaKgFiyat, armutKgFiyat, domatesKgFiyat, patlıcanKgFiyat, muzKgFiyat;
        double elmaMiktar, armutMiktar, domatesMiktar, patlıcanMiktar, muzMiktar ;
        double elmaTutar , armutTutar, domatesTutar, patlıcanTutar, muzTutar;
        double toplamTutar;


        elmaKgFiyat = 3.67;
        armutKgFiyat = 2.14;
        domatesKgFiyat = 1.11;
        patlıcanKgFiyat = 5.00;
        muzKgFiyat = 0.95;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kg elma alacaksınız? : ");
        elmaMiktar = scanner.nextDouble();
        elmaTutar = elmaMiktar*elmaKgFiyat;

        System.out.print("Kaç kg armut alacaksınız? : ");
        armutMiktar = scanner.nextDouble();
        armutTutar = armutMiktar*armutKgFiyat;

        System.out.print("Kaç kg domates alacaksınız? : ");
        domatesMiktar = scanner.nextDouble();
        domatesTutar = domatesMiktar*domatesKgFiyat;

        System.out.print("Kaç kg patlıcan alacaksınız? : ");
        patlıcanMiktar = scanner.nextDouble();
        patlıcanTutar = patlıcanMiktar*patlıcanKgFiyat;

        System.out.print("Kaç kg muz alacaksınız? : ");
        muzMiktar = scanner.nextDouble();
        muzTutar = muzMiktar*muzKgFiyat;

        toplamTutar = elmaTutar + armutTutar + patlıcanTutar + domatesTutar + muzTutar;

        System.out.print("Toplam ödemeniz gereken tutar" + toplamTutar+"TL");

    }
}
