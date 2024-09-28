package main.domain;

import jdk.internal.util.xml.impl.Pair;

import java.util.ArrayList;
import java.util.List;

public class Game implements BoardObserver {

    Board board;
    List<Player> players;
    boolean isGameOver;
    int inturnPlayer;

    public Game() {
        board = new Board();
        players = new ArrayList<>();
        isGameOver = false;
    }

    public void addPlayers(List<Player> player) {
        player.get(0).move = PlayerMove.X;
        player.get(1).move = PlayerMove.O;
        players.addAll(player);
        inturnPlayer = 0;
    }

    public void startGame() {
        while (!isGameOver) {
            System.out.println("Player turn : " + players.get(inturnPlayer).playerName);
            board.move(players.get(inturnPlayer));
            inturnPlayer = (inturnPlayer + 1) % 2;
        }
    }


    @Override
    public void observe(BoardStatus boardStatus) {
        if (boardStatus.gameStatus != GameStatus.RUNNING) {
            isGameOver = true;
            if (boardStatus.gameStatus == GameStatus.WON) {
                System.out.println("Game is over !! user %s won" + boardStatus.userWon.playerName);
            } else {
                System.out.println("Game is Drawn");
            }
        }
    }
}
