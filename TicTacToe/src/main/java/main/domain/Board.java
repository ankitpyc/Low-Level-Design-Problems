package main.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Board implements BoardPublisher {

    public PlayerMove[][] board;
    int[] ColumnSum, RowSum;
    int totalMoves;
    List<BoardObserver> boardObservers;

    public Board() {
        board = new PlayerMove[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = PlayerMove.E;
            }
        }
        ColumnSum = new int[3];
        RowSum = new int[3];
        boardObservers = new ArrayList<>();
    }

    public void move(Player player, Position pos) {
        int x = pos.getX();
        int y = pos.getY();
        System.out.println("moves as " + pos.getX() + ", " + pos.getY());
        while (board[x][y] == PlayerMove.X || board[x][y] == PlayerMove.O) {
            x = (int) (Math.random() * (3));
            y = (int) (Math.random() * (3));
        }
        board[x][y] = player.move;
        updateBoardGameStatus(x, y, player);
    }

    private void updateBoardGameStatus(int x, int y, Player player) {
        System.out.println("Player move is " + player.move.move);
        totalMoves += 1;
        ColumnSum[y] += player.move.move;
        RowSum[x] += player.move.move;
        printBoard();
        if (isDiagonalWin(x, y, player)) {
            System.out.println("Game Over !! Player won : " + player.playerName);
            BoardStatus boardStatus = new BoardStatus();
            boardStatus.userWon = player;
            boardStatus.board = this;
            notifyOnStatusChange(boardStatus);
            return;
        }
        if (totalMoves == 9) {
            BoardStatus boardStatus = new BoardStatus();
            boardStatus.gameStatus = GameStatus.DRAW;
            boardStatus.board = this;
            notifyOnStatusChange(boardStatus);
        }

    }

    private void printBoard() {
        System.out.println("---------- Board Game ------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        System.out.println();
        System.out.println();

    }

    private boolean isDiagonalWin(int x, int y, Player player) {
        System.out.println("Column sum y " + Arrays.toString(ColumnSum));
        System.out.println("Row sum y " + Arrays.toString(RowSum));

        if (ColumnSum[y] == 3 || ColumnSum[y] == -3) {
            return true;
        }

        if (RowSum[(x)] == 3 || RowSum[x] == -3) {
            return true;
        }

        int diagonalSum = board[0][0].move + board[1][1].move + board[2][2].move;
        int antiDiagonal = board[0][2].move + board[1][1].move + board[2][0].move;
        if (diagonalSum == 3 || diagonalSum == -3 || antiDiagonal == 3 || antiDiagonal == -3) {
            return true;
        }
        return false;
    }

    public boolean isValidMove(int x, int y) {
        if(x <0 || x>=3 || y < 0 || y>=3)
            return false;
        return board[x][y] == PlayerMove.E;
    }

    @Override
    public void notifyOnStatusChange(BoardStatus boardStatus) {
        for (BoardObserver observer : boardObservers) {
            observer.observe(boardStatus);
        }
    }
}
