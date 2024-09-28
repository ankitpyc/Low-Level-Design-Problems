package main.domain;

public class BoardStatus {
    Board board;
    Player userWon;
    GameStatus gameStatus;
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getUserWon() {
        return userWon;
    }

    public void setUserWon(Player userWon) {
        this.userWon = userWon;
    }
}
