package maceraOyunu.player;

import maceraOyunu.chars.Archer;
import maceraOyunu.chars.GameChar;
import maceraOyunu.chars.Knight;
import maceraOyunu.chars.Samurai;

import java.util.Scanner;

public class Player {

    //--------------- Nitelikler
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private int originalHealth;
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;


//---------------


    //--------------- Constructor Metodu
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }


    //---------------

    //--------------- Getter Setter Metodlar�
    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    //---------------



    //--------------- Karakter Se�iminin oldu�u metod
    public void selectChar(){

       GameChar[] gameChars = {new Samurai() ,new Archer(), new Knight()};

        System.out.println("---------------------------------------------------------------------------------------------------");

        for (GameChar gameChar : gameChars){
            System.out.println("Karakter ID : " +gameChar.getId() +
                    "\t\t Karakter : "+gameChar.getName() +
                    "\t\t Hasar : " +gameChar.getDamage() +
                    "\t\t Sa�l�k : "+gameChar.getHealth() +
                    "\t\t Para : " + gameChar.getMoney());
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        System.out.print("L�tfen Se�mek �stedi�iniz Karakterin Numaras�n� Giriniz => ");
        int selectChar = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------------");

        switch (selectChar){

            case 1:
                initPlayer(new Samurai());
                break;

            case 2:
                initPlayer(new Archer());
                break;

            case 3:
                initPlayer(new Knight());
                break;

            default:
                initPlayer(new Samurai());
        }

        System.out.println("Se�ti�iniz Karakter ==>     : "+this.getCharName() +"\t\t Hasar : " +this.getDamage() + "\t\t Sa�l�k : "+this.getHealth() + "\t\t Para : " + this.getMoney());
        System.out.println("---------------------------------------------------------------------------------------------------");

    }
    //---------------


    //--------------- Se�ilen karakter niteliklerinin oyuncu niteliklerine aktar�m�
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    ///////// Oyuncu Ve Envanter Bilgisi

    public void printInfo(){



        System.out.println("Sahip Oldu�unuz Silah =>  "+this.getInventory().getWeapon().getWeaponName()+"\t\t|\t"+
                "Sahip Oldu�unuz Z�rh =>  "+this.getInventory().getArmor().getArmorName() +"\t\t|\t"+
                "Z�rh�n Bloklama Kuvveti =>  "+this.getInventory().getArmor().getBlock() +"\t\t|\t"+
                "Hasar�n�z =>  "+this.getTotalDamage()+"\t\t|\t"+
                "Sa�l�k =>  "+this.getHealth()+"\t\t|\t"+
                "Bakiyeniz =>  "+this.getMoney());
        System.out.println("---------------------------------------------------------------------------------------------------");

    }

    /////////





}
