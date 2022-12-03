package ilkBolumOdevler;

import java.util.Scanner;

public class HipotenusuBul {
    public static void main(String[] args) {
    int kenar1, kenar2;
    double hipotenus,u,cevre,alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk Kenar uzunluğunu giriniz : ");
        kenar1 = scanner.nextInt();

        System.out.println("İkinci Kenar uzunluğunu giriniz : ");
        kenar2 = scanner.nextInt();

        hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        u = (kenar1+kenar2+hipotenus)/2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-hipotenus));

        System.out.println("Hipotenus uzunluğu : "+hipotenus);
        System.out.println("Cevre uzunluğu : "+cevre);
        System.out.println("Alan  : "+alan);


    }
}
