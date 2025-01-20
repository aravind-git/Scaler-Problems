import controller.GameController;
import model.Board;
import model.BotPlayer;
import model.HumanPlayer;
import model.Player;
import strategies.ColumnWinningStrategy;
import strategies.RowWinningStrategy;
import strategies.WinningStrategy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create a new instance of the HumanPlayer class
        GameController controller = new GameController();
        Player humanPlayer = new HumanPlayer();
        Player botPlayer =new BotPlayer();
        ArrayList<Player> players = new ArrayList<>();
        players.add(humanPlayer);
        players.add(botPlayer);
        Board board = new Board(3);
        ArrayList<WinningStrategy> strategyArrayList = new ArrayList<>();
        strategyArrayList.add(new ColumnWinningStrategy());
        strategyArrayList.add(new RowWinningStrategy());
        controller.startGame(3, players, strategyArrayList);
        System.out.println(board.toString());
    }
}