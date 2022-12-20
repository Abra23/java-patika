package maceraOyunu.location.normalLoc;

import maceraOyunu.location.normalLoc.toolstoreObj.Armor;
import maceraOyunu.location.normalLoc.toolstoreObj.Weapon;
import maceraOyunu.player.Player;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Ma�aza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----------- Ma�azaya Ho�geldiniz -----------");

        boolean showMenu = true;

       while (showMenu){
           System.out.println("\n1 - Silahlar \n2 - Z�rhlar \n3 - ��k�� Yap ");
           System.out.print("Yapmak �stedi�iniz ��lemi Se�iniz ==> ");
           int selectCase = scanner.nextInt();
           while (selectCase < 1 || selectCase > 3){
               System.out.println("Ge�ersiz Bir De�er Girdiniz . L�tfen Tekrar Deneyiniz : ");
               selectCase = scanner.nextInt();
           }

           switch (selectCase){

               case 1 :
                   printWeapon();
                   buyWeapon();
                   break;

               case 2:
                   printArmor();
                   buyArmor();
                   break;

               case 3:
                   System.out.println("---------------------------------------------------------------------------------------------------");
                   System.out.println("Tekrar G�r��mek �zere !!!");
                   showMenu = false;
                   break;

           }
       }

    return true;
    }

    public void printWeapon(){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Silahlar ==> ");
        System.out.println();

        for (Weapon w : Weapon.weapons()){
            System.out.println(w.getId()+"=>\t\t\t\t"+w.getWeaponName()+
                    "\t\t\t|\t\t\t\tHasar =>  " +w.getDamage()+
                    "\t\t\t|\t\t\t\tFiyat =>  " +w.getPrice());
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        System.out.println("0=>\t\t\t\t��k�� Yap ");
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void buyWeapon(){
        System.out.print("Silah Se�imini Yap�n�z ==> ");
        int selectWeaponID = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------------");

        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Ge�ersiz Bir De�er Girdiniz . L�tfen Tekrar Deneyiniz ==>  ");
            selectWeaponID = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------");
        }

        if (selectWeaponID != 0){

            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null){


                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli Bakiyeniz Bulunmamaktad�r :( ");
                    System.out.println("---------------------------------------------------------------------------------------------------");
                }

                else {
                    System.out.println(selectedWeapon.getWeaponName() + "  Silah�n� Sat�n Ald�n�z !!!");
                    System.out.println("-------------------");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiyeniz ==> " + this.getPlayer().getMoney());
                    System.out.println("-------------------");
                    System.out.println("�nceki Silah�n�z ==> " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("G�ncel Sahip Oldu�unuz Silah ==> " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    System.out.println("�uan Hasar Katsay�n�z => "+this.getPlayer().getDamage());

                    System.out.println("---------------------------------------------------------------------------------------------------");
                }
            }
        }



    }

    public void printArmor(){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Z�rhlar ==> ");
        System.out.println();

        for (Armor a : Armor.armors()){
            System.out.println(a.getId()+"=>\t\t\t\t"+a.getArmorName()+
                    "\t\t\t|\t\t\t\tBloklama =>  " +a.getBlock()+
                    "\t\t\t|\t\t\t\tFiyat =>  " +a.getPrice());
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("0=>\t\t\t\t��k�� Yap ");
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void buyArmor(){
        System.out.print("Z�rh Se�imini Yap�n�z ==> ");
        int selectedArmorID = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------------");

        while (selectedArmorID < 0 || selectedArmorID > Weapon.weapons().length){
            System.out.print("Ge�ersiz Bir De�er Girdiniz . L�tfen Tekrar Deneyiniz ==>  ");
            selectedArmorID = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------");
        }

        if (selectedArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectedArmorID);

            if (selectedArmor != null){

                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli Bakiyeniz Bulunmamaktad�r :( ");
                }

                else {
                    System.out.println(selectedArmor.getArmorName() + " itemini " + selectedArmor.getPrice() + "$ �cret kar��l��� sat�n ald�n�z");
                    System.out.println("-------------------");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiyeniz ==> " + this.getPlayer().getMoney());
                    System.out.println("-------------------");
                    System.out.println("�nceki Z�rh�n�z ==> " + this.getPlayer().getInventory().getArmor().getArmorName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("�uan Sahip Oldu�unuz Z�rh ==> " + this.getPlayer().getInventory().getArmor().getArmorName());
                    System.out.println("Sahip Oldu�unuz Bloklama Kuvveti ==> " + this.getPlayer().getInventory().getArmor().getBlock());
                    System.out.println("---------------------------------------------------------------------------------------------------");
                }

            }
        }






    }
}
