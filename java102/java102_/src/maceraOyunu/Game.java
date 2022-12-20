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
        System.out.println("Mecare Oyununa Ho�geldiniz ==>");
        System.out.print("Kullan�c� Ad�n�z� Giriniz : ");
        String playerName = scanner.next();

        Player player = new Player(playerName);
        System.out.println(player.getName()+" Oyuna Ho�geldiniz !!!");
        System.out.println("L�tfen Oyuna Devam Edebilmek ��in Bir Karakter Se�iniz ==>");
        player.selectChar();

        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("-----B�lgeler-----");
            System.out.println();
            System.out.println("1 - G�venli Ev --> Sa�l�k Yenileme");
            System.out.println("2 - Ma�aza --> Al��-veri� i�in");
            System.out.println("3 - Ma�ara --> Sava� Lokasyonu (Zombi) �d�l <Yemek>");
            System.out.println("4 - Orman --> Sava� Lokasyonu (Vampir) �d�l <Odun>");
            System.out.println("5 - Nehir --> Sava� Lokasyonu (Ay�) �d�l <Su>");
            System.out.println("0 - ��k�� Yap (Oyunu Sonland�r...)");
            System.out.println();
            System.out.print("L�tfen Gitmek �stedi�iniz Lokasyonu Se�iniz : ");
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
                    System.out.println("Ge�erli Bir De�er Giriniz !!!");
                    System.out.println("---------------------------------------------------------------------------------------------------");
                    continue;
            }

            if (location == null){
                System.out.println("Oyunu Terkettiniz. Yine Bekleriz ");
                break;
            }

            if (!location.onLocation()){
                System.out.println("Karde�im �ld�n Yaaa ...");
                break;
            }
            if (player.getHealth() <= 0){
                System.out.println("Karde�im �ld�n Yaaa ...");
                break;
            }
        }




    }




}
