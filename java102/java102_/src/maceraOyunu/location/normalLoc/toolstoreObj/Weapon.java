package maceraOyunu.location.normalLoc.toolstoreObj;

public class Weapon {

    private String weaponName;
    private int id;
    private int damage;
    private int price;

    public Weapon(int id, int damage, int price, String weaponName) {
        this.id = id;
        this.damage = damage;
        this.price = price;
        this.weaponName = weaponName;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];

        weaponList[0] = new Weapon(1,2,25,"Tabanca");
        weaponList[1] = new Weapon(2,3,35,"Kýlýç");
        weaponList[2] = new Weapon(3,7,45,"Tüfek");

        return weaponList;
    }

    public static Weapon getWeaponObjByID(int id){
        for (Weapon w : Weapon.weapons()){
            if (w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
