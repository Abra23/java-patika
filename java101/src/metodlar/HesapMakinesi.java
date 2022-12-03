package metodlar;

import java.util.Scanner;

public class HesapMakinesi {

    static void  sum(){
        Scanner input = new Scanner(System.in);
        int number, result=0, i=1;
        while(true){
            System.out.print(i++ + ".sayı = ");
            number = input.nextInt();
            if(number == 0) break;
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void subtraction(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = input.nextInt();
        int number, result = 0;

        for(int i=1; i<=counter; i++){
            System.out.print(i++ + ".sayı = ");
            number = input.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void multiplication(){
        Scanner input = new Scanner(System.in);
        int number, result=1, i=1;
        while(true){
            System.out.print(i++ + ".sayı = ");
            number = input.nextInt();
            if(number == 1) break;
            if(number == 0) result=0;
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void division(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = input.nextInt();
        double number, result = 0.0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextDouble();

            if(i !=1 && number == 0){
                System.out.println("Böleni 0 giremezsiniz !");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = input.nextInt();
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factoriel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int n = input.nextInt();
        int result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        int a = input.nextInt();
        System.out.print("Böleni Giriniz : ");
        int b = input.nextInt();

        System.out.println("Sonuç : " + (a % b) );
    }

    static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenar Uzunluğu : ");
        int a = input.nextInt();
        System.out.print("2.Kenar Uzunluğu : ");
        int b = input.nextInt();

        System.out.println("Çevre : " + 2*(a+b));
        System.out.println("Alan : " + (a*b));
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select = input.nextInt();
            if(select == 0) break;

            switch (select){
                case 1 :
                    sum();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Lütfen Geçerli Bir Değer Giriniz !");
            }
        }
    }
}
