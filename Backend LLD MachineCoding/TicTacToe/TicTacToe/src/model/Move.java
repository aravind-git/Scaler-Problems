package model;



public class Move {
    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }


    Cell cell;

    public Move(int row,int col) {
        this.cell = new Cell(row,col);
    }
}
