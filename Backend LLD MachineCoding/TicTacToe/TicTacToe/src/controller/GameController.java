package controller;

import model.*;
import strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    public Game startGame(int dimensions, List<Player> players, List<WinningStrategy> winningStrategyList) {
         return Game.builder().setPlayerList(players)
                 .setBoard(new Board(dimensions))
                 .setWinningStrategies(winningStrategyList)
                 .setGameState(GameState.ONSGOING)
                 .setMoves(new ArrayList<>())
                 .setCurrentPlayerIndex(0)
                 .setPlayerList(players)
                 .build();
    }

    public void displayBoard(Game game){
        System.out.println(game.board.toString());
        System.out.println(game.playerList.get(game.currentPlayerIndex).getName() + "make a move");

    }
    public void displayGameState(Game game){
        System.out.println(game.playerList.get(game.currentPlayerIndex).getName() + "make a move");

    }
//    public void play(Game game, Move move){
//        if(game.gameState==GameState.INITIALIZED){
//            game.gameState=GameState.STARTED;
//        }
//        if(game.gameState==GameState.STARTED){
//            game.moves.add(move);
//            game.board.getCells().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellState(move.getCell().getCellState());
//            if(checkWinner(game,move)){
//                game.gameState=GameState.FINISHED;
//            }
//            else{
//                game.currentPlayerIndex=(game.currentPlayerIndex+1)%game.playerList.size();
//            }
//        }
//    }



    public void makeNextMove(Game game){
        if(game.moves.size() == game.board.getN()*game.board.getN()){
            game.gameState = GameState.DRAW;
            System.out.println("Game is a draw");
        }
        Player player = game.playerList.get(game.currentPlayerIndex);
        System.out.printf("Current player making move %s ",player.getName());
        System.out.println();
        Move move = player.makeMove(game.board);
        validate(move,game.board);

        updateBoard(move,game.board,player);

        game.moves.add(move);
        // Check for a winner
        for (WinningStrategy strategy : game.winningStrategies) {
            if (strategy.checkWinner(game.board, move)) {
                game.gameState = GameState.COMPLETED;
                System.out.println("Player " + player.getName() + " wins!");
                return;
            }
        }
        game.currentPlayerIndex = updateNextPlayer(game);

    }
    public GameState getGameState(Game game){
        return game.gameState;
    }

    private static void validate(Move move, Board board) {
        Cell cell=move.getCell();
        if (move.getCell().getRow() < 0 || move.getCell().getRow() >= board.getN() || move.getCell().getCol() < 0 || move.getCell().getCol() >= board.getN()) {
            throw new IllegalArgumentException("Invalid move");
        }

        if(board.getCells().get(cell.getRow()).get(cell.getCol()).getCellState()==CellState.OCCUPIED){
            throw new IllegalArgumentException("Invalid move");
        }
    }
    private static void updateBoard(Move move, Board board,Player player){
        board.getCells().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellState(CellState.OCCUPIED);
        board.getCells().get(move.getCell().getRow()).get(move.getCell().getCol()).setPlayer(player);

    }

    public static int updateNextPlayer(Game game){
        return game.currentPlayerIndex=(game.currentPlayerIndex+1)%game.playerList.size();

    }
}
