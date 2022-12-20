package maceraOyunu.player;

import maceraOyunu.location.normalLoc.toolstoreObj.Armor;
import maceraOyunu.location.normalLoc.toolstoreObj.Weapon;

public class Inventory {

    private Weapon weapon;
    private Armor armor;
    private String water;
    private String food;
    private String firewood;

    public Inventory(){
        this.weapon = new Weapon(-1,0,0,"Yumruk");
        this.armor = new Armor(-1,"Zýrhsýz",0,0);

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }


}
