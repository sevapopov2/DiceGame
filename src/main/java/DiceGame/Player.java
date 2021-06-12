package DiceGame;

public class Player {
    private String playerName;
    private int id;
    private int score;
    private boolean winner;
    public Player(String name, int id, int score){
        this.playerName = name;
        this.id = id;
        this.score = score;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getId(){
        return id;
    }
    public int getScore(){
        return score;
    }
    public boolean isWinner(){
        return winner;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setWinner(boolean winner){
        this.winner = winner;
    }
}
