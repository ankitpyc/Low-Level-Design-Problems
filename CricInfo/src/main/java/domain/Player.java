package domain;

public class Player extends Stats {
    String playerName;
    String PlayingTeam;

    public Player(String playerName, String playingTeam) {
        this.playerName = playerName;
        PlayingTeam = playingTeam;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayingTeam() {
        return PlayingTeam;
    }

    public void setPlayingTeam(String playingTeam) {
        PlayingTeam = playingTeam;
    }
}
