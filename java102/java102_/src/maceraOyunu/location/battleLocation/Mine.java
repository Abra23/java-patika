package maceraOyunu.location.battleLocation;

import maceraOyunu.obtacle.Obstacle;
import maceraOyunu.obtacle.Snake;
import maceraOyunu.player.Player;

public class Mine extends BattleLocation{
    public Mine(Player player) {
        super(player,"Maden",new Snake(),"treasury",5);
    }


}
