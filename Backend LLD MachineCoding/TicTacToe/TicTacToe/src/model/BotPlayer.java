package model;

import java.util.Random;

public class BotPlayer extends Player{
    BotDifficulty difficulty;

    @Override
    public Move makeMove(Board board) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(4); // Generates a random number between 0 (inclusive) and 4 (exclusive)
        int randomNumber2 = random.nextInt(4); // Generates a random number between 0 (inclusive) and 4 (exclusive)
        return new Move(randomNumber1,randomNumber2);
    }

    public BotPlayer(BotDifficulty difficulty,int id,String name,Character symbol) {
        this.difficulty = difficulty;
        super.id = id;
        super.name = name;
        super.symbol = symbol;
    }
}
