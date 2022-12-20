package maceraOyunu.obtacle;

public abstract class Obstacle {

    private int id;
    private String obtacleName;
    private int damage;
    private int health;
    private int award;
    private int originalHealth;


    public Obstacle(int id,String obtacleName, int damage, int health,int award) {
        this.id = id;
        this.obtacleName = obtacleName;
        this.damage = damage;
        this.health = health;
        this.award = award;
        this.originalHealth = health;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObtacleName() {
        return obtacleName;
    }

    public void setObtacleName(String obtacleName) {
        this.obtacleName = obtacleName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }

        this.health = health;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
