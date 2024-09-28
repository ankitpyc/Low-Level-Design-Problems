package domain;

import java.util.List;

public class Team {
    TeamName teamName;
    List<Player> players;

    public Team(List<Player> players, TeamName teamName) {
        this.players = players;
        this.teamName = teamName;
    }

    public TeamName getTeamName() {
        return teamName;
    }

    public void setTeamName(TeamName teamName) {
        this.teamName = teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
