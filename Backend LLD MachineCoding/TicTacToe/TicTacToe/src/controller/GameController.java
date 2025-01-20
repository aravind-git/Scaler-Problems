package controller;

import model.*;
import strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimensions, List<Player> players, List<WinningStrategy> winningStrategyList) {
         return Game.builder().setPlayerList(players)
                 .setBoard(new Board(dimensions))
                 .setWinningStrategies(winningStrategyList)
                 .setGameState(GameState.INITIALIZED)
                 .setCurrentPlayerIndex(0)
                 .setPlayerList(players)
                 .build();
    }
}
