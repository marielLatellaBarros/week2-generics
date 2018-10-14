package be.pxl.generics.opgave3;

public class TeamApp {
    public static void main (String[] args) {

        Team<SoccerPlayer> soccerTeam = new Team("River Plate");

        soccerTeam.addPlayer(new SoccerPlayer ("Chaves"));
//        soccerTeam.addPlayer(new BaseballPlayer("Ginnobili"));

        System.out.println(soccerTeam.numberOfPlayers());

        soccerTeam.matchResult(new Team("Las Leonas"), 5,0);
        soccerTeam.matchResult(new Team("Boca Juniors"), 5,0);
        soccerTeam.matchResult(new Team("Don Gato"), 5,0);

    }
}
