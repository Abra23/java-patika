package kosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scanner = new Scanner(System.in);

        System.out.print("ilk Sayıyı giriniz : ");
        n1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı giriniz : ");
        n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminizi Tuşlayınız : ");
        select = scanner.nextInt();

        if(select == 1){
            System.out.println("Toplam : "+(n1+n2));
        }
        else if(select == 2){
            System.out.println("Fark : "+(n1-n2));
        }
        else if(select == 3){
            System.out.println("Çarpım : "+(n1*n2));
        }
        else if(select ==4){
            System.out.println("Bölüm : "+(n1/n2));
        }

        else {
            System.out.println("Yanlış bir seçim yaptınız !!! ");
        }


    }
}
