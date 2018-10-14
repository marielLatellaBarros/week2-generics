package be.pxl.generics.opgave3;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private ArrayList<T> players = new ArrayList<>();


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

    public int numberOfPlayers() {
        return players.size();
    }

    public int ranking() {
        return this.getWon() * 3 + this.getTied();
    }

    public Player getPlayers(int i) {
        return players.get(i);
    }

    public void addPlayer(T player) {
        if (players.contains(player)) {
            System.out.println(player.getName() + " is already on this team!");
            return;
        }
            players.add(player);
            System.out.println(player.getName() + " picked for team " + this.getName());
    }



    public void matchResult(Team<T> oponent, int ourScore, int theirScore) {
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
