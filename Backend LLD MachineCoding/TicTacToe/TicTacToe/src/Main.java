import controller.GameController;
import model.*;
import strategies.ColumnWinningStrategy;
import strategies.RowWinningStrategy;
import strategies.WinningStrategy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create a new instance of the HumanPlayer class
        GameController gameController = new GameController();
        Player humanPlayer = new HumanPlayer("mailid@mail,com",1,"Human ",'X');
        Player botPlayer = new HumanPlayer("BotDifficulty.HARD",2,"Aravind",'O');
        ArrayList<Player> players = new ArrayList<>();
        players.add(humanPlayer);
        players.add(botPlayer);
        Board board = new Board(3);
        ArrayList<WinningStrategy> strategyArrayList = new ArrayList<>();
        strategyArrayList.add(new ColumnWinningStrategy());
        strategyArrayList.add(new RowWinningStrategy());
        Game game = gameController.startGame(3, players, strategyArrayList);
        gameController.displayBoard(game);
        while (gameController.getGameState(game) == GameState.ONSGOING) {
            gameController.makeNextMove(game);
            gameController.displayBoard(game);
        }

        if(gameController.getGameState(game) == GameState.DRAW){
            System.out.println("Game is a draw");
        }
        else{
            System.out.println("Winner is " + game.playerList.get(game.currentPlayerIndex).getName());
        }

    }
}