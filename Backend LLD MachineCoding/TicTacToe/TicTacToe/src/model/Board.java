package model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    int N;
    List<List<Cell>> cells;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public Board(int N) {
        this.N = N;
        cells = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                row.add(new Cell(i, j));
            }
            cells.add(row);
        }
    }

    @Override
    public String toString() {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(cells.get(i).get(j).cellState+" ");
            }
            System.out.println();
        }
        return "";
    }
}
