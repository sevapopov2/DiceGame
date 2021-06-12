package DiceGame;

import java.util.Random;

public class Dice {
    Random rand = new Random();
    private int diceNumber;
    public Dice(int diceNumber){
        this.diceNumber = diceNumber;
    }
    
    public int getDiceNumber(){
        return diceNumber;
    }
    public void setDiceNumber(int diceNumber){
        this.diceNumber = diceNumber;
    }
    public int diceRolling(){
        diceNumber = rand.nextInt(6);
        return diceNumber;
    }

    public void printDice(){
        System.out.println(diceNumber);
    }
}
