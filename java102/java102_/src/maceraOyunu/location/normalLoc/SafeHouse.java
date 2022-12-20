package maceraOyunu.location.normalLoc;

import maceraOyunu.player.Player;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "G�venli Ev");
    }

    @Override
    public boolean onLocation(){
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("G�venli Evdesiniz. G�vendesiniz :)" );
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Sa�l���n�z Yenilendi...");
        System.out.println("---------------------------------------------------------------------------------------------------");


        return true;
    }

}
