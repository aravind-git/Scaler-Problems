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
                if(cells.get(i).get(j).cellState == CellState.OCCUPIED){
                    System.out.print(cells.get(i).get(j).player.symbol);
                }
                else if(cells.get(i).get(j).cellState == CellState.FREE){
                    System.out.print("|");
                }

            }
            System.out.println();

        }
        return "";
    }
    public void displayGameState(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(cells.get(i).get(j).cellState == CellState.OCCUPIED){
                    System.out.print(cells.get(i).get(j).player.symbol);
                }
                else if(cells.get(i).get(j).cellState == CellState.FREE){
                    System.out.print("|");
                }

            }
            System.out.println();

        }
    }
}
