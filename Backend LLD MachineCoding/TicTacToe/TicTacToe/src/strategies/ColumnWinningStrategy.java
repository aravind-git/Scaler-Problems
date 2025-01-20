package strategies;

import model.Board;
import model.CellState;
import model.Move;

public class ColumnWinningStrategy implements WinningStrategy {

    @Override
    public Boolean checkWinner(Board board, Move move) {

        int col = move.getCell().getCol();
        for (int i = 0; i < board.getN(); i++) {
            if (move.getCell().getCellState() == CellState.FREE || board.getCells().get(i).get(col).getPlayer() != move.getCell().getPlayer()) {
                return false;
            }
        }
        return true;

    }
}
