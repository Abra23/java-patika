package kosulluIfadeler;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, notOrt,gecmenotu = 55;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();


        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        notOrt = (mat+fizik+kimya+turkce+tarih+muzik)/6;


        if (mat<0 || mat>100
                || fizik<0 || fizik>100 || turkce<0 || turkce>100 || kimya<0 || kimya>100 || muzik<0 || muzik>100){
            System.out.println("Lütfen 0 ve 100 aralığında bir değer giriniz. Program sonlanıyor, işlem yapılamadı");
        }

        else {
            if (notOrt>gecmenotu){
                System.out.println("Tebrikler Geçme Notunuz : "+notOrt);
            }
            else{
                System.out.println("Maalesef Geçemediniz Notunuz : "+notOrt);
            }

        }




    }
}
