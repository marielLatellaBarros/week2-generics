package be.pxl.generics.opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    List<T> players = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

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

    //TODO: Check how to get a list of something
    public List<T> getPlayers() {
        return players;
    }

    public void addPlayer(T pyer) {
        players.add(pyer);
    }

    public int numberOfPlayers() {
        return players.size();
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name;
    }
}
