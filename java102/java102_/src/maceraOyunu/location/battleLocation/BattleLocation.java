package maceraOyunu.location.battleLocation;

import maceraOyunu.location.location.Location;
import maceraOyunu.obtacle.Obstacle;
import maceraOyunu.player.Player;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public abstract class BattleLocation extends Location {

    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    private int obstacleCount;
    private Scanner scanner = new Scanner(System.in);

    public BattleLocation(Player player, String locationName,Obstacle obstacle,String award,int maxObstacle) {
        super(player, locationName);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public int getObstacleCount() {
        return obstacleCount;
    }

    public void setObstacleCount(int obstacleCount) {
        this.obstacleCount = obstacleCount;
    }

    @Override
    public boolean onLocation()  {

        this.setObstacleCount(this.rndObtacleCount());
        System.out.println("�uan Bulundu�unuz Yer ==> "+ this.getLocationName());
        System.out.println("Dikkatli ol !!!  Burada "+this.getObstacleCount()+" adet "+this.getObstacle().getObtacleName()+" ya��yor");
        System.out.print("<S>ava��cak m�s�n  yoksa <K>a�acak m�s�n ? ==> ");
        String selectCase = scanner.nextLine();
        selectCase = selectCase.toUpperCase();
        System.out.println("---------------------------------------------------------------------------------------------------");

        if (selectCase.equals("S")){
            System.out.println("Demek Sava�acaks�n :) O zaman sava� ba�las�n ... ");

            System.out.println();
            System.out.println("---------------------------------------------------------------------------------------------------");

            if (combat(this.obstacleCount)){
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.println(this.getLocationName() + " B�lgesindeki t�m d��manlar� yendiniz !!!");
                System.out.println("Envanterinize Eklenen �d�l ==> " +this.getAward());
                return true;
            }

            if (this.getPlayer().getHealth() < 0){
                System.out.println("�ld�n :(");
                return false;
            }

        }

        return true;
    }


    public boolean combat(int obstacleCount){

        for (int i = 1; i <= obstacleCount; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);

            if (rndStartNumber()){
                firstStirkerPlayer();
                if (!firstStirkerPlayer() ){
                    return false;
                }
            }

            else {
                firstStrikerObtacle();
                if (!firstStrikerObtacle() ){
                    return false;
                }
            }

        }
        return true;
    }


    public void afterHit(){
        System.out.println("Can�n�z ==> "+this.getPlayer().getHealth());
        System.out.println(this.obstacle.getObtacleName() +" Can� ==> " +this.obstacle.getHealth());
        System.out.println("---------------------------------------------------------------------------------------------------");
    }

    public void playerStats(){

        System.out.println("Oyuncunun De�erleri ==>");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Se�ilen Karakter ==> " +this.getPlayer().getCharName());
        System.out.println("Karakterin Sa�l��� ==> " +this.getPlayer().getHealth());
        System.out.println("Karakterin Elinde Olan Silah ==> " +this.getPlayer().getInventory().getWeapon().getWeaponName());
        System.out.println("Karakterin Sahip Oldu�u Z�rh ==> " +this.getPlayer().getInventory().getArmor().getArmorName());
        System.out.println("Karakterin Hasar De�eri ==> " +this.getPlayer().getTotalDamage());
        System.out.println("Karakterin Bloklama De�eri ==> " +this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Karakterin Kalan Bakiyesi ==> " +this.getPlayer().getMoney());
        System.out.println("---------------------------------------------------------------------------------------------------");

    }

    public void obstacleStats(int i){
        System.out.println("Burada Bulunan Canavar ==>" +this.getObstacle().getObtacleName());
        System.out.println("Burada Bulunan Canavar Say�s� ==>" +this.getObstacleCount());
        System.out.println("Kalan Canavar Say�s� ==> " +(this.getObstacleCount() - i + 1) );
        System.out.println("Canavar Sa�l���  ==> " +this.getObstacle().getHealth());
        System.out.println("Canavar Hasar De�eri ==> " +this.getObstacle().getDamage());
        System.out.println("Canavar �d�l De�eri ==> " +this.getObstacle().getAward());
        System.out.println("---------------------------------------------------------------------------------------------------");

    }

    public int rndObtacleCount(){
        Random random = new Random();
        return random.nextInt(this.getMaxObstacle())+1;
    }

    public boolean firstStirkerPlayer(){
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<V>ur yada <K>a� ");
                String selectCombat = scanner.nextLine().toUpperCase();
                System.out.println("---------------------------------------------------------------------------------------------------");

                if (selectCombat.equals("V")){
                    System.out.println("Siz Vurdunuz !!!");
                    this.getObstacle().setHealth( this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getObstacle().getHealth() > 0 ){
                        System.out.println("---------------------------------------------------------------------------------------------------");
                        System.out.println(this.getObstacle().getObtacleName() +" Canavar� Size Vurdu .");

                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();

                        if (obstacleDamage < 0 ){
                            obstacleDamage = 0;
                        }

                        this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstacle().getDamage() + this.getPlayer().getInventory().getArmor().getBlock());
                        System.out.println("Bloklama De�erinizin Engelledi�i Hasar Miktar� ==> " +this.getPlayer().getInventory().getArmor().getBlock());
                        System.out.println("Toplamda Ald���n�z Hasar Miktari ==> " +obstacleDamage  );
                        System.out.println("---------------------------------------------------------------------------------------------------");
                        afterHit();
                    }

                }
                else {
                    return false;
                }

                if (this.getObstacle().getHealth() <= 0 ){
                    System.out.println("D��man� Yendiniz ");
                    System.out.println(this.getObstacle().getAward() + "$ �d�l kazand�n�z. ");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                    System.out.println("---------------------------------------------------------------------------------------------------");
                }

            }


        return true;
    }


    public boolean firstStrikerObtacle(){
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.println("<V>ur yada <K>a� ");
                String selectCombat = scanner.nextLine().toUpperCase();
                System.out.println("---------------------------------------------------------------------------------------------------");

                if (selectCombat.equals("V")){
                    System.out.println(this.getObstacle().getObtacleName()+" Size Vurdu !!!");
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getObstacle().getDamage() + this.getPlayer().getInventory().getArmor().getBlock());
                    int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obstacleDamage < 0 ){
                        obstacleDamage = 0;
                    }

                    System.out.println("Bloklama De�erinizin Engelledi�i Hasar Miktar� ==> " +this.getPlayer().getInventory().getArmor().getBlock());
                    System.out.println("Toplamda Ald���n�z Hasar Miktari ==> " +obstacleDamage  );
                    afterHit();

                    if (this.getPlayer().getHealth() > 0 ){
                        System.out.println("---------------------------------------------------------------------------------------------------");
                        System.out.println("Siz Vurdunuz .");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());
                        afterHit();
                    }
                    else {
                        return false;
                    }

                    if (this.getObstacle().getHealth() <= 0 ){
                        System.out.println("D��man� Yendiniz ");
                        System.out.println(this.getObstacle().getAward() + "$ �d�l kazand�n�z. ");
                        this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                        System.out.println("---------------------------------------------------------------------------------------------------");
                    }

                }



            }

            if (this.getPlayer().getHealth() <= 0 ){
                return false; //�ld�k
            }


        return true;
    }

    public boolean rndStartNumber(){

        Random random = new Random();
        int rndNumber = random.nextInt(2);

        if (rndNumber == 0){
            return true;
        }

        return false;
    }




}
