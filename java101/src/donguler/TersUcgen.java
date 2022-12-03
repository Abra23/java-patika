package donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamakSayisi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayını Giriniz ==> ");
        basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi - 1; i >= 1; i--) {
            for (int k = basamakSayisi; k > i; k--) {
                System.out.print(" ");
            }

            for (int l = 1; l <= (2 * i - 1); l++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

    }
}
