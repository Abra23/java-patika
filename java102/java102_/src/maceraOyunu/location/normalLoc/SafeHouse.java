package maceraOyunu.location.normalLoc;

import maceraOyunu.player.Player;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("Güvenli Evdesiniz. Güvendesiniz :)" );
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Saðlýðýnýz Yenilendi...");
        System.out.println("---------------------------------------------------------------------------------------------------");


        return true;
    }

}
