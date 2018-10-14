package be.pxl.generics.opgave3;

public class TeamApp {
    public static void main (String[] args) {

        Team soccerTeam = new Team("River Plate");
        soccerTeam.addPlayer(new SoccerPlayer ("Chaves"));
        soccerTeam.addPlayer(new BaseballPlayer("Ginnobili"));
        System.out.println(soccerTeam.numberOfPlayers());
        System.out.println(soccerTeam.getPlayers());
    }
}
