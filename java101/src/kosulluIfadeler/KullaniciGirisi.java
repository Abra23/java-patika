package kosulluIfadeler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, pass;
        String userNameT, passT; // Doğru olan kullanıcı adı ve şifre

        userNameT = "abra23";
        passT = "23";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz : ");
        userName = scanner.nextLine();

        System.out.println("Şifrenizi giriniz : ");
        pass = scanner.nextLine();

        if((userName == userNameT)&&(pass==passT)){
            System.out.println("Bilgileriniz Onaylandı Giriş Başarılı");
        }

        else {

            if(userName.equals(userNameT)){
                System.out.println("Şifre hatalı ");

                System.out.println("Şifrenizi değişmek için => 1\nDevam Etmek için => Herhangi rakama");
                int deger = scanner.nextInt();

                if(deger==1){
                    String newPass;
                    System.out.println("Yeni şifenizi giriniz : ");
                    newPass = scanner.nextLine();

                    if (newPass==passT){
                        System.out.println("Eski şifre ile aynı");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu");
                    }

                }

            }
            else if(pass.equals(passT)){
                System.out.println("Kullanıcı adı hatalı");
            }

            else{
                System.out.println("hem kullanıcı adı hem şifre hatalı");
            }


        }


    }
}
