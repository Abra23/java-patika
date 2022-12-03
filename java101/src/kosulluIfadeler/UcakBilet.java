package kosulluIfadeler;

import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        double mesafe, indirim, yasindirim, gidisdonus, toplam, normal;
        int tip, yas;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Lütfen Gitmek İstedğiniz Mesafeyi Giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Lütfen Yolculuk Tipini Seçiniz \n1.Tek Yön : \n2.Gidiş Dönüş : ");
        tip = input.nextInt();

        if (yas > 0 && mesafe > 0 && (tip == 1 || tip == 2)) {
            normal = mesafe* 0.5;
            if (yas < 12){
                yasindirim = normal*0.5;
                indirim = normal - yasindirim;
                toplam = indirim;
                if (tip == 1){
                    gidisdonus = indirim*0.2;
                }
                System.out.print("Bilet Tutarı =" +toplam);
            }
            if (yas>= 12 && yas <= 24){
                yasindirim = normal*0.1;
                indirim = normal- yasindirim;
                toplam = indirim;
                if ( tip==2 ){
                    gidisdonus = indirim*0.2;
                    toplam =(indirim-gidisdonus)*2;
                }
                System.out.print("Bilet Tutarı =" +toplam);
            }
            if (yas>24 && yas<65){
                normal = mesafe*0.10;
                toplam = normal;
                if (tip == 2){
                    gidisdonus = normal*0.2;
                    toplam = (normal-gidisdonus)*2;
                }
                System.out.print("Bilet Tutarı =" +toplam);
            }
            if (yas > 65){
                yasindirim = normal*0.3;
                indirim = normal - yasindirim;
                toplam = indirim;
                if (tip == 2) {
                    gidisdonus = indirim * 0.2;
                    toplam = (indirim - gidisdonus) * 2;
                }
                System.out.print("Bilet Tutarı =" + toplam);
            }
        }
        else {
            System.out.print("Hatalı Veri Girişi Yaptınız!");
        }


    }
}
