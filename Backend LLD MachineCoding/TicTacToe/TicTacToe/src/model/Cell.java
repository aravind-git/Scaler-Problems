package model;

public class Cell {

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    Player player;
    CellState cellState;
    int row,col;

    public Cell(int i, int j) {
        this.row =i;
        this.col =j;
        this.cellState = CellState.FREE;
    }
}
