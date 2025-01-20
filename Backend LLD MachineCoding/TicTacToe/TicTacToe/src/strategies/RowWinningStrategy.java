package strategies;

import model.Board;
import model.CellState;
import model.Move;

public class RowWinningStrategy implements WinningStrategy {

    @Override
    public Boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        for (int i = 0; i < board.getN(); i++) {
            if( move.getCell().getCellState() == CellState.FREE || board.getCells().get(row).get(i).getPlayer() != move.getCell().getPlayer()){
                return false;
            }
        }
        return true;
    }
}
