package maceraOyunu.location.battleLocation;

import maceraOyunu.obtacle.Obstacle;
import maceraOyunu.obtacle.Zombie;
import maceraOyunu.player.Player;

public class Cave extends BattleLocation{

    public Cave(Player player) {
        super(player,"Maðara",new Zombie(),"Yemek",3);
    }


}
