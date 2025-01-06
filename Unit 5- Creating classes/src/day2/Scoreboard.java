package day2;

public class Scoreboard {

    //atributes
    private String teamName1;
    private String teamName2;
    private int team1Score;
    private int team2Score;
    private boolean active;

    //constructors
    public Scoreboard(String teamName1, String teamName2){
        this.teamName1 = teamName1;
        this.teamName2 = teamName2;
        team1Score = 0;
        team2Score = 0;
        active = true;
    }
    //methods
    public void recordPlay(int pointsScored){
        if(pointsScored == 0){
            active = !active;
        }
        else{
            if(active){
                team1Score += pointsScored;
            }
            else{
                team2Score += pointsScored;
            }
        }
    }

    public String getScore(){
        if(active){
            return "team1 score - " + team1Score + " team2 score - " + team2Score + " active team: " + teamName1;
        }
        else{
            return "team1 score - " + team1Score + " team2 score - " + team2Score + " active team: " + teamName2;
        }
        
    }

}
