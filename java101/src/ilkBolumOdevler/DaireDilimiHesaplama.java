package ilkBolumOdevler;

import java.util.Scanner;

public class DaireDilimiHesaplama {
    public static void main(String[] args) {
        double yaricap, aci, pi = 3.14,diliminAlani;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçap bilgisini giriniz : ");
        yaricap = scanner.nextDouble();

        System.out.print("Dairenin açı bilgisini giriniz : ");
        aci = scanner.nextDouble();

        diliminAlani = (pi * (yaricap * yaricap) * aci)/360;
        System.out.print("Daire diliminin alanı : "+diliminAlani);

    }
}
