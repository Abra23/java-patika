package ilkBolumOdevler;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        //Not Ortalaması Örnek Başlangıcı
        int mat, fizik, kimya, turkce, tarih, muzik, notToplam;

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

        notToplam = (mat+fizik+kimya+tarih+turkce+muzik);
        float ortalama = notToplam/6f;

        boolean sonuc = ortalama>=60;

        System.out.println("Ortlamanız: "+ortalama);

        String durum = sonuc ? "Tebrikler ortalamanız sınıf geçmek için yeterlidir.":"Üzgünüz ortalamanız geçiş için yeterli değil.";

        System.out.println(durum);
    }
}
