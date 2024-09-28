package domain.ScoreCard;

import domain.Ball;
import domain.Observer.MatchObserver;
import domain.Observer.MatchSubscriber;
import domain.Player;
import domain.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchScoreBoard implements MatchObserver {
    Team firstBattingTeam;
    Team firstBowlingTeam;
    Map<Team, List<Map<Player,ScoreCardEntry>>> matchScoreCard;

    public MatchScoreBoard(Team firstBattingTeam, Team firstBowlingTeam, Map<Team, List<ScoreCard>> matchScoreCard) {
        this.firstBattingTeam = firstBattingTeam;
        this.firstBowlingTeam = firstBowlingTeam;
        initializeScoreCard();
    }

    public Team getFirstBattingTeam() {
        return firstBattingTeam;
    }

    public void setFirstBattingTeam(Team firstBattingTeam) {
        this.firstBattingTeam = firstBattingTeam;
    }

    public Team getFirstBowlingTeam() {
        return firstBowlingTeam;
    }

    public void setFirstBowlingTeam(Team firstBowlingTeam) {
        this.firstBowlingTeam = firstBowlingTeam;
    }

    public Map<Team, List<ScoreCard>> getMatchScoreCard() {
        return matchScoreCard;
    }

    public void setMatchScoreCard(Map<Team, List<ScoreCard>> matchScoreCard) {
        this.matchScoreCard = matchScoreCard;
    }

    public void initializeScoreCard() {
        this.matchScoreCard = new HashMap<>();
        this.matchScoreCard.put(firstBattingTeam, new HashMap<>());
        this.matchScoreCard.put(firstBowlingTeam, new HashMap<>());
        for(Player player : firstBattingTeam.getPlayers()){
            this.matchScoreCard.get(firstBattingTeam).put(player,)
        }
    }

    @Override
    public void observe(Ball ball) {
        Ball balls = ball;
        if (balls.isWicket()){
            Player bowlingplayer = firstBowlingTeam.getPlayers().get(0);
            bowlingplayer.totalWicketsTaken = bowlingplayer.totalWicketsTaken + 1;
            Player battingPlayer = firstBattingTeam.getPlayers().get(0);
            matchScoreCard.get(getFirstBattingTeam()).put(battingPlayer,ScoreCardEntry);
        }
    }
}
