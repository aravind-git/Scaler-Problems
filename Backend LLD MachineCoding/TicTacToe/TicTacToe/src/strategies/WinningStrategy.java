package strategies;

import model.Board;
import model.Move;

public interface WinningStrategy {


    Boolean checkWinner(Board board, Move move);
}
