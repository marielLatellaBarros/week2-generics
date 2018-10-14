package be.pxl.generics.opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    List<Player> players = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
