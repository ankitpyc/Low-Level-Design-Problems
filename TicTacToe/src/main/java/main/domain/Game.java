package main.domain;

import jdk.internal.util.xml.impl.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game implements BoardObserver {

    Board board;
    List<Player> players;
    volatile boolean isGameOver;
    int inturnPlayer;

    public Game() {
        board = new Board();
        players = new ArrayList<>();
        isGameOver = false;
        this.board.boardObservers.add(this);
    }

    public void addPlayers(List<Player> player) {
        player.get(0).move = PlayerMove.X;
        player.get(1).move = PlayerMove.O;
        players.addAll(player);
        inturnPlayer = 0;
    }

    public void startGame() {
        while (!isGameOver) {
            System.out.println("Game over " + isGameOver);
            System.out.println("Player turn : " + players.get(inturnPlayer).playerName);
            String[] inp = readUserData();
            while (!board.isValidMove(Integer.parseInt(inp[0]), Integer.parseInt(inp[1]))) {
                System.out.println("Invalid Move , Please enter a Valid move");
                inp = readUserData();
            }
            board.move(players.get(inturnPlayer), new Position(Integer.parseInt(inp[0]), Integer.parseInt(inp[1])));
            inturnPlayer = (inturnPlayer + 1) % 2;
        }
    }

    public String[] readUserData() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        return s.split(",");
    }


    @Override
    public void observe(BoardStatus boardStatus) {
        if (boardStatus.gameStatus != GameStatus.RUNNING) {
            isGameOver = true;
            System.out.println("SEtting gqme over");
            if (boardStatus.gameStatus == GameStatus.WON) {
                System.out.println("Game is over !! user %s won" + boardStatus.userWon.playerName);
            } else {
                System.out.println("Game is Drawn");
            }
        }
    }
}
