package main.domain;

public enum PlayerMove {

    X(1), O(-1), E(0);

    int move;

    PlayerMove(int move) {
        this.move = move;
    }


}
