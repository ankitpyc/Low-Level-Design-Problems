package main;

import main.domain.Game;
import main.domain.Player;

import java.util.ArrayList;
import java.util.List;

import static sun.audio.AudioPlayer.player;

public class TicTacToe {
    public static void main(String[] args) {
        Game game = new Game();
        List<Player> playerList = new ArrayList<>();
        Player player1 = new Player("Ams");
        Player player2 = new Player("ADD");
        playerList.add(player1);
        playerList.add(player2);
        game.addPlayers(playerList);
        game.startGame();

    }

}
