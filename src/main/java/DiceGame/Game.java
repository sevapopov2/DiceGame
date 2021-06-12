package DiceGame;

import java.util.ArrayList;

public class Game{
    private Dice dice;
    public Game(Dice dice){
        //this.players
        this.dice = dice;
    }

    public ArrayList<Player> createPlayers(){
        Player player1 = new Player("andrey", 1, 0);
        Player player2 = new Player("Anna", 2, 0);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        return players;
    }

    //этот метод теперь возвращает победителя
    public Player startGame(){
        ArrayList<Player> players = createPlayers();

        players.get(0).setScore(dice.diceRolling());
        players.get(1).setScore(dice.diceRolling());
        if (players.get(0).getScore() > players.get(1).getScore()){
            players.get(0).setWinner(true);
            return players.get(0);
        }
        else{
            players.get(1).setWinner(true);
            return players.get(1);

        }
    }

    public void printWinners(ArrayList <Player> players){
        if (players.get(0).isWinner()){
            System.out.println("The winner is" + players.get(0).getPlayerName() + "!");
        }
        else{
            System.out.println("The winner is " + players.get(1).getPlayerName() + "!");
        }
    }
}
