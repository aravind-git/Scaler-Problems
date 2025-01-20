package model;

import java.util.List;

import lombok.*;
import strategies.WinningStrategy;

public class Game {
    public List<Player> playerList;
    public Board board;
    public GameState gameState;
    public int currentPlayerIndex;
    public List<WinningStrategy> winningStrategies;
    public List<Move> moves;
    public static GameBuilder builder(){
        return new GameBuilder();
    }
    private Game(GameBuilder gameBuilder) {
        this.board=gameBuilder.board ;
        this.playerList = gameBuilder.playerList;
        this.winningStrategies=gameBuilder.winningStrategies;
        this.gameState=gameBuilder.gameState;
        this.moves=gameBuilder.moves;
    }

    public static class GameBuilder{
        List<Player> playerList;
        Board board;
        GameState gameState;
        int currentPlayerIndex;
        List<WinningStrategy> winningStrategies;
        List<Move> moves;
;

        public GameBuilder setPlayerList(List<Player> playerList) {
            this.playerList = playerList;
            return this;
        }

        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;

        }

        public GameBuilder setGameState(GameState gameState) {
            this.gameState = gameState;
            return this;

        }

        public GameBuilder setCurrentPlayerIndex(int currentPlayerIndex) {
            this.currentPlayerIndex = currentPlayerIndex;
            return this;

        }

        public GameBuilder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;

        }

        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;

        }

        public Game build(){
           return new Game(this);
        }

    }
}
