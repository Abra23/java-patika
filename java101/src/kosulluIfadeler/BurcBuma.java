package kosulluIfadeler;

import java.util.Scanner;

public class BurcBuma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ay, gun;

        System.out.print("Doğduğunuz ay :");
        ay = inp.nextInt();

        System.out.print("Doğduğunuz gün :");
        gun = inp.nextInt();

        if (ay == 1 && gun <= 22) {
            System.out.println("Oğlak Burcu.");
        }
        if ((ay == 1 && gun > 22) && (gun <= 31)) {
            System.out.println("Kova Burcu.");
        }
        if (ay == 1 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 2 && gun >= 20) && (gun <= 28)) {
            System.out.println("Balık Burcu.");
        }
        if (ay == 2 && gun < 20) {
            System.out.println("Kova Burcu.");
        }
        if (ay == 2 && gun > 28) {
            System.out.println("Hatalı gün girdiniz!");
        }


        if ((ay == 3 && gun >= 20) && (gun <= 31)) {
            System.out.println("Koç Burcu.");
        }
        if (ay == 3 && gun < 20) {
            System.out.println("Balık Burcu.");
        }
        if (ay == 3 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 4 && gun <= 20)) {
            System.out.println("Koç Burcu.");
        }
        if ((ay == 4 && gun > 20) && (gun <= 31)) {
            System.out.println("Boğa Burcu.");
        }
        if (ay == 4 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if (ay == 5 && gun <= 21) {
            System.out.println("Boğa Burcu.");
        }
        if ((ay == 5 && gun > 21) && (gun <= 31)) {
            System.out.println("İkizler Burcu.");
        }
        if (ay == 5 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 6 && gun >= 23) && (gun <= 31)) {
            System.out.println("Yengeç Burcu.");
        }
        if (ay == 6 && gun < 23) {
            System.out.println("İkizler Burcu.");
        }
        if (ay == 6 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }


        if ((ay == 7 && gun >= 23) && (gun <= 31)) {
            System.out.println(" Aslan Burcu.");
        }
        if (ay == 7 && gun < 23) {
            System.out.println("Yengeç Burcu.");
        }
        if (ay == 7 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 8 && gun <= 23)) {
            System.out.println("Aslan Burcu.");
        }
        if ((ay == 8 && gun > 23) && (gun <= 31)) {
            System.out.println("Başak Burcu.");
        }
        if (ay == 8 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 9 && gun >= 23) && (gun <= 31)) {
            System.out.println(" Terazi Burcu.");
        }
        if (ay == 9 && gun < 23) {
            System.out.println("Başak Burcu.");
        }
        if (ay == 9 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 10 && gun < 23)) {
            System.out.println("Terazi Burcu.");
        }
        if ((ay == 10 && gun >= 23) && (gun <= 31)) {
            System.out.println("Akrep Burcu.");
        }
        if (ay == 10 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 11 && gun >= 23) && (gun <= 31)) {
            System.out.println(" Yay Burcu.");
        }
        if (ay == 11 && gun < 23) {
            System.out.println("Akrep Burcu.");
        }
        if (ay == 11 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");
        }

        if ((ay == 12 && gun < 22)) {
            System.out.println("Yay Burcu.");
        }
        if ((ay == 12 && gun >= 22) && (gun <= 31)) {
            System.out.println("Oğlak Burcu.");
        }
        if (ay == 12 && gun > 31) {
            System.out.println("Hatalı gün girdiniz!");


        }


    }
}

