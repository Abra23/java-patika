package maceraOyunu.location.normalLoc;

import maceraOyunu.location.location.Location;
import maceraOyunu.player.Player;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player, String locationName) {
        super(player, locationName);
    }

    @Override
    public abstract boolean onLocation() ;

}
