package donguler;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int n;
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harmonik dizisi alınacak sayı: ");
        n = scanner.nextInt();

        for (int i = 1;i <= n; i++){
            total += (1.0/i);
        }

        System.out.println("Sonuç: "+total);

    }
}
