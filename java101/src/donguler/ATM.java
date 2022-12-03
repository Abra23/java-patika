package donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int hak = 3, secim;
        while (hak > 0) {
            Scanner a = new Scanner(System.in);
            System.out.println("Kullaniciyi girinz ");
            String kullanici = a.nextLine();
            System.out.println("Parolayi girinz ");
            String parola = a.nextLine();


            double bakiye = 1500;
            double cekim, yatirma;

            if (kullanici.equals("aydin") && parola.equals("123")) {
                System.out.println("Hosgeldiniz");

                do {
                    System.out.println("1-Para cekmek icin\n+" +
                            "2-Para yatirmak icin\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Cikis");
                    secim = a.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.println("Bakiyeniz:" + bakiye);
                            System.out.println("Ne kadar cekeceksin");
                            cekim = a.nextFloat();

                            if (cekim > bakiye) {
                                System.out.println("Yetersiz bakiye");
                            } else {
                                bakiye -= cekim;
                            }
                            break;

                        case 2:
                            System.out.println("Ne kadar yatıracaksınız");
                            yatirma = a.nextInt();
                            bakiye += yatirma;
                            System.out.println("Yeni bakiye" + bakiye);
                            break;

                        case 3:
                            System.out.println("Bakiyeniz:" + bakiye);
                            break;
                    }

                }
                while (secim != 4);
                {
                    System.out.println("Gule gule");
                    break;

                }
            } else {
                hak--;
                System.out.println("Hatali giriniz yaptiniz kalan hak:" + hak);
            }
        }



    }
}
