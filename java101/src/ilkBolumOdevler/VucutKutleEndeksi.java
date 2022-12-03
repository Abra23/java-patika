package ilkBolumOdevler;

import java.util.Scanner;

public class VucutKutleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, endeks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz (metre cinsinden): ");
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        endeks = kilo / (boy * boy);

        System.out.print("Vucut kütle endeksiniz : "+endeks);
    }
}
