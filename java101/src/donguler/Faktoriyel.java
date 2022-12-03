package donguler;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int n,r, nFakt = 1, rFakt = 1, n_rFakt = 1;

        double kombinayson;

        Scanner scanner = new Scanner(System.in);
        System.out.println("n sayısı: ");
        n = scanner.nextInt();

        System.out.println("r sayısı: ");
        r = scanner.nextInt();

        for (int i =1; i<=n;i++){
            nFakt *= i;
        }

        for (int i = 1; i <= r; i++){
            rFakt *= i;
        }

        for (int i = 1; i <= n-r; i++){
            n_rFakt *= i;
        }

        kombinayson = nFakt / (rFakt * n_rFakt);

        System.out.println("n-r Kombinasyonu :  "+kombinayson);


    }
}
