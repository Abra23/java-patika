package maceraOyunu.location.normalLoc.toolstoreObj;

public class Armor {
    private int id;
    private String armorName;
    private int block;
    private int price;

    public Armor(int id, String armorName, int block, int price) {
        this.id = id;
        this.armorName = armorName;
        this.block = block;
        this.price = price;
    }

    public static Armor[] armors (){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1,"Hafif Z�rh",1,15);
        armorList[1] = new Armor(2,"Orta Z�rh",3,25);
        armorList[2] = new Armor(3,"A��r Z�rh",5,45);


        return armorList;
    }

    public static Armor getArmorObjByID(int id){

        for (Armor a : Armor.armors()){
            if (a.getId() == id){
                return a;
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

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
