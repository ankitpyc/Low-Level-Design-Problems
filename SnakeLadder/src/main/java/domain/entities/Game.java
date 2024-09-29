package domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Game {

    List<Player> playerList;
    Boolean isGameOver;
    Player winner;
    Board board;


    public Game(List<Player> playerList, List<Snake> snakeList, List<Ladder> ladderList) {
        board = new Board(snakeList, ladderList);
    }

    public void playGame() {
        while (!isGameOver) {
            for (int i = 0; ; i++) {
                i = i % 6;
                Player player = playerList.get(i);
                Point point = board.move(player);
                if (getIsGameOver(point)) {
                    winner = player;
                    break;
                }
            }
        }
    }

    public boolean isGameOver(Point point) {
        if (point.getX() == 9 && point.getY() == 9) return true;
        return false;
    }


}
