package maceraOyunu.location.battleLocation;

import maceraOyunu.obtacle.Bear;
import maceraOyunu.obtacle.Obstacle;
import maceraOyunu.player.Player;

public class River extends BattleLocation{

    public River(Player player) {
        super(player,"Nehir",new Bear(),"Su",2);
    }
}
