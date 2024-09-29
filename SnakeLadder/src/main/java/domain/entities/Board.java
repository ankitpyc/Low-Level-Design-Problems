package domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Board {

    private static final int boardSize = 10;

    private Point[][] boardGrid;

    public Board(List<Snake> snakeList, List<Ladder> ladderList) {
        boardGrid = new Point[10][10];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                boardGrid[i][j] = new Point(i, j);
            }
        }
        for (Snake snake : snakeList) {
            boardGrid[snake.getX()][snake.getY()] = snake;
        }
        for (Ladder ladder : ladderList) {
            boardGrid[ladder.getX()][ladder.getY()] = ladder;
        }
    }

    public Point move(Player player) {
        int val = Dice.rollDice();
        int nextYPos = player.getCurrPosition().getY();
        int nextXPos = player.getCurrPosition().getX();
        if (player.getCurrPosition().getX() + val > 9) {
            nextYPos += 1;
            if (nextYPos % 2 == 1) {
                nextXPos = 9 - (player.getCurrPosition().getX() + val);
            } else {
                nextXPos = player.getCurrPosition().getX() + val;
            }
        }

        handleSnakeBite(player, nextXPos, nextYPos);
        handleLadderClimb(player, nextXPos, nextYPos);
        return new Point(nextXPos, nextYPos);
    }

    private void handleLadderClimb(Player player, int nextXPos, int nextYPos) {
        if (boardGrid[nextXPos][nextYPos] instanceof Ladder) {
            Ladder ladder = (Ladder) boardGrid[nextXPos][nextYPos];
            player.setCurrPosition(ladder.getTo());
        }
    }

    private void handleSnakeBite(Player player, int nextXPos, int nextYPos) {
        if (boardGrid[nextXPos][nextYPos] instanceof Snake) {
            Snake snake = (Snake) boardGrid[nextXPos][nextYPos];
            player.setCurrPosition(snake.getTo());
        }
    }

}
