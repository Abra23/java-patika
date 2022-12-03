package metodlar;

import java.util.Scanner;

public class RecursiveUsAlma {
    static int power(int n,int m) {
        if (m > 0) {
            return n * power(n, m - 1);
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 1;
        do{
            System.out.println("Kuvveti alınacak sayıyı giriniz : ");
            int n = input.nextInt();
            System.out.println("Üs değerini giriniz : ");
            int m = input.nextInt();
            System.out.println(power(n,m));
            System.out.println("Devam etmek için : 1- Devam   2-Çıkış ");
            cont = input.nextInt();
        }
        while (cont != 2);
    }
}
