package model;

import java.util.Scanner;

public class HumanPlayer extends Player{

    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Enter row and column");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        return new Move(row, col);
    }

    public HumanPlayer(String email,int id,String name,Character symbol) {
        this.email = email;
        super.id = id;
        super.name = name;
        super.symbol = symbol;
    }
}
