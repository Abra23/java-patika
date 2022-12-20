package maceraOyunu.location.normalLoc;

import maceraOyunu.location.normalLoc.toolstoreObj.Armor;
import maceraOyunu.location.normalLoc.toolstoreObj.Weapon;
import maceraOyunu.player.Player;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Maðaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----------- Maðazaya Hoþgeldiniz -----------");

        boolean showMenu = true;

       while (showMenu){
           System.out.println("\n1 - Silahlar \n2 - Zýrhlar \n3 - Çýkýþ Yap ");
           System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçiniz ==> ");
           int selectCase = scanner.nextInt();
           while (selectCase < 1 || selectCase > 3){
               System.out.println("Geçersiz Bir Deðer Girdiniz . Lütfen Tekrar Deneyiniz : ");
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
                   System.out.println("Tekrar Görüþmek Üzere !!!");
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
        System.out.println("0=>\t\t\t\tÇýkýþ Yap ");
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void buyWeapon(){
        System.out.print("Silah Seçimini Yapýnýz ==> ");
        int selectWeaponID = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------------");

        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.print("Geçersiz Bir Deðer Girdiniz . Lütfen Tekrar Deneyiniz ==>  ");
            selectWeaponID = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------");
        }

        if (selectWeaponID != 0){

            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null){


                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli Bakiyeniz Bulunmamaktadýr :( ");
                    System.out.println("---------------------------------------------------------------------------------------------------");
                }

                else {
                    System.out.println(selectedWeapon.getWeaponName() + "  Silahýný Satýn Aldýnýz !!!");
                    System.out.println("-------------------");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiyeniz ==> " + this.getPlayer().getMoney());
                    System.out.println("-------------------");
                    System.out.println("Önceki Silahýnýz ==> " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Güncel Sahip Olduðunuz Silah ==> " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    System.out.println("Þuan Hasar Katsayýnýz => "+this.getPlayer().getDamage());

                    System.out.println("---------------------------------------------------------------------------------------------------");
                }
            }
        }



    }

    public void printArmor(){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Zýrhlar ==> ");
        System.out.println();

        for (Armor a : Armor.armors()){
            System.out.println(a.getId()+"=>\t\t\t\t"+a.getArmorName()+
                    "\t\t\t|\t\t\t\tBloklama =>  " +a.getBlock()+
                    "\t\t\t|\t\t\t\tFiyat =>  " +a.getPrice());
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("0=>\t\t\t\tÇýkýþ Yap ");
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void buyArmor(){
        System.out.print("Zýrh Seçimini Yapýnýz ==> ");
        int selectedArmorID = scanner.nextInt();
        System.out.println("---------------------------------------------------------------------------------------------------");

        while (selectedArmorID < 0 || selectedArmorID > Weapon.weapons().length){
            System.out.print("Geçersiz Bir Deðer Girdiniz . Lütfen Tekrar Deneyiniz ==>  ");
            selectedArmorID = scanner.nextInt();
            System.out.println("---------------------------------------------------------------------------------------------------");
        }

        if (selectedArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectedArmorID);

            if (selectedArmor != null){

                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("Yeterli Bakiyeniz Bulunmamaktadýr :( ");
                }

                else {
                    System.out.println(selectedArmor.getArmorName() + " itemini " + selectedArmor.getPrice() + "$ ücret karþýlýðý satýn aldýnýz");
                    System.out.println("-------------------");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Bakiyeniz ==> " + this.getPlayer().getMoney());
                    System.out.println("-------------------");
                    System.out.println("Önceki Zýrhýnýz ==> " + this.getPlayer().getInventory().getArmor().getArmorName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Þuan Sahip Olduðunuz Zýrh ==> " + this.getPlayer().getInventory().getArmor().getArmorName());
                    System.out.println("Sahip Olduðunuz Bloklama Kuvveti ==> " + this.getPlayer().getInventory().getArmor().getBlock());
                    System.out.println("---------------------------------------------------------------------------------------------------");
                }

            }
        }






    }
}
