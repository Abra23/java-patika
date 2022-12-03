package kosulluIfadeler;

import java.util.Scanner;

public class EtkinlikOner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sicaklik;

        System.out.print("Sıcaklık giriniz : ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (sicaklik > 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if (sicaklik > 25) {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}
