package maceraOyunu.location.battleLocation;

import maceraOyunu.obtacle.Obstacle;
import maceraOyunu.obtacle.Vampire;
import maceraOyunu.player.Player;

public class Forest extends BattleLocation{

    public Forest(Player player) {
        super(player,"Orman",new Vampire(),"Ahþap",3);
    }

}
