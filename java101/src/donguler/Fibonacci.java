package donguler;

import java.io.OutputStream;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int elemanSayisi;

        int a = 0, b = 1;
        int sonuc = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç elemanlı Fibonacci dizisi oluşturacaksınız ==> ");
        elemanSayisi = scanner.nextInt();
        System.out.print("0 1 ");

        for(int i = 0; i < elemanSayisi - 2; i++){
            sonuc = a+b;
            a = b;
            b = sonuc;

            System.out.print(sonuc+" ");
        }

    }
}
