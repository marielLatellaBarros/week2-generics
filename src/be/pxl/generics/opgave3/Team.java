package be.pxl.generics.opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    ArrayList<T> players = new ArrayList<>();


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

    public ArrayList<T> getPlayers() {
        return players;
    }

    public void addPlayer(T player) {
        players.add(player);
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public void matchResult(Team oponent, int ourScore, int theirScore) {
        this.played++;
        this.won++;
        this.lost++;
        this.tied++;

        oponent.played++;
        oponent.won++;
        oponent.lost++;
        oponent.tied++;
    }

}
