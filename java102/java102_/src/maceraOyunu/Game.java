package maceraOyunu;

import maceraOyunu.location.battleLocation.Cave;
import maceraOyunu.location.battleLocation.Forest;
import maceraOyunu.location.battleLocation.River;
import maceraOyunu.location.location.Location;
import maceraOyunu.location.normalLoc.SafeHouse;
import maceraOyunu.location.normalLoc.ToolStore;
import maceraOyunu.player.Player;

import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Mecare Oyununa Hoþgeldiniz ==>");
        System.out.print("Kullanýcý Adýnýzý Giriniz : ");
        String playerName = scanner.next();

        Player player = new Player(playerName);
        System.out.println(player.getName()+" Oyuna Hoþgeldiniz !!!");
        System.out.println("Lütfen Oyuna Devam Edebilmek Ýçin Bir Karakter Seçiniz ==>");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("-----Bölgeler-----");
            System.out.println();
            System.out.println("1 - Güvenli Ev --> Saðlýk Yenileme");
            System.out.println("2 - Maðaza --> Alýþ-veriþ için");
            System.out.println("3 - Maðara --> Savaþ Lokasyonu (Zombi) Ödül <Yemek>");
            System.out.println("4 - Orman --> Savaþ Lokasyonu (Vampir) Ödül <Odun>");
            System.out.println("5 - Nehir --> Savaþ Lokasyonu (Ayý) Ödül <Su>");
            System.out.println("0 - Çýkýþ Yap (Oyunu Sonlandýr...)");
            System.out.println();
            System.out.print("Lütfen Gitmek Ýstediðiniz Lokasyonu Seçiniz : ");
            int selectLoc = scanner.nextInt();

            System.out.println();

            switch (selectLoc){

                case 0:
                    location = null;
                    break;

                case 1:
                    location = new SafeHouse(player);
                    break;

                case 2:
                    location = new ToolStore(player);
                    break;

                case 3:
                    location = new Cave(player);
                    break;

                case 4:
                    location = new Forest(player);
                    break;

                case 5:
                    location = new River(player);
                    break;

                default:
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    System.out.println("Geçerli Bir Deðer Giriniz !!!");
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    continue;
            }

            if (location == null){
                System.out.println("Oyunu Terkettiniz. Yine Bekleriz ");
                break;
            }

            if (!location.onLocation()){
                System.out.println("Kardeþim Öldün Yaaa ...");
                break;
            }
            if (player.getHealth() <= 0){
                System.out.println("Kardeþim Öldün Yaaa ...");
                break;
            }
        }




    }




}
