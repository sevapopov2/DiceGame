package DiceGame;

public class DiceMain {
    public static void main(String[] args) {
        Game game = new Game(new Dice(6));
        Player winner = game.startGame();
        System.out.println(winner.getPlayerName());
    }
}

//Я попробовал ещё раз воспроизвести логику приложения. Кажется, у меня получилось! Только я не смог сделать юнит тесты, поскольку не уверен, что приложение вообще правильно написано. У меня не получилось сгенирировать случайное число, надеюсь эта попытка лучше! Я пытался сделать программу достаточно долго.