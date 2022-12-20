package maceraOyunu.location.location;

import maceraOyunu.player.Player;

import java.util.Scanner;

public abstract class Location {

    //
    private Player player;
    private String LocationName;
    public static Scanner scanner = new Scanner(System.in);
    ///


    ////
    public Location(Player player, String locationName) {
        this.player = player;
        this.LocationName = locationName;
    }
    //////

    ///////
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        this.LocationName = locationName;
    }
    //////


    ///
    public abstract boolean onLocation();


}
