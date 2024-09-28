package domain.ScoreCard;

import domain.Ball;
import domain.Observer.MatchObserver;
import domain.Player;
import domain.Team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchScoreBoard implements MatchObserver {
    int InningsNo;
    int totalOverToBePlayed;
    Team battingTeam;
    Player onStrikePlayer;
    Player nonStrikePlayer;
    Player bowlingPlayer;
    Team bowlingTeam;
    Map<Team, ScoreBoard> matchScoreCard;

    public MatchScoreBoard(Team firstBattingTeam, Team firstBowlingTeam, Map<Team, List<ScoreCard>> matchScoreCard) {
        this.battingTeam = firstBattingTeam;
        this.bowlingTeam = firstBowlingTeam;
        this.totalOverToBePlayed = 50;
        this.InningsNo = 1;
        initializeScoreCard();
    }

    public Team getFirstBattingTeam() {
        return battingTeam;
    }

    public void setFirstBattingTeam(Team firstBattingTeam) {
        this.battingTeam = firstBattingTeam;
    }

    public Team getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(Team firstBowlingTeam) {
        this.bowlingTeam = firstBowlingTeam;
    }

    public Map<Team, ScoreBoard> getMatchScoreCard() {
        return matchScoreCard;
    }

    public void setMatchScoreCard(Map<Team, ScoreBoard> matchScoreCard) {
        this.matchScoreCard = matchScoreCard;
    }

    public void initializeScoreCard() {
        this.matchScoreCard = new HashMap<>();
        matchScoreCard.put(battingTeam, initializeScoreBoard(battingTeam));
        bowlingPlayer = bowlingTeam.getPlayers().get(0);
        matchScoreCard.put(bowlingTeam, initializeScoreBoard(bowlingTeam));
        onStrikePlayer = battingTeam.getPlayers().get(0);
        nonStrikePlayer = bowlingTeam.getPlayers().get(1);
    }

    private ScoreBoard initializeScoreBoard(Team team) {
        ScoreBoard scoreBoard = new ScoreBoard();
        ScoreCard battingScoreCard = new ScoreCard(new ArrayList<>());
        ScoreCard bowlingScoreCard = new ScoreCard(new ArrayList<>());

        for (Player player : team.getPlayers()) {
            battingScoreCard.getScoreCardEntryList().put(player, new ScoreCardEntry(player));
            bowlingScoreCard.getScoreCardEntryList().put(player, new ScoreCardEntry(player));
        }

        return scoreBoard;
    }

    @Override
    public void observe(Ball ball) {

        updateBowlingScoreCard(ball);
        updateBattingScoreCard(ball);
    }

    private void updateBowlingScoreCard(Ball ball) {
        ScoreCard bowlingScoreCard = matchScoreCard.get(bowlingTeam).BowlingScoreCard;
        if (bowlingScoreCard.totalOversBowled == totalOverToBePlayed) {
            changeInnings();
        }

        if (ball.isWicket()) {
            bowlingPlayer.totalWicketsTaken = bowlingPlayer.totalWicketsTaken + 1;

            bowlingScoreCard.setTotalWicketsTaken(bowlingScoreCard.totalWicketsTaken + 1);
            if (bowlingScoreCard.totalWicketsTaken == 10) {
                changeInnings();
                return;
            }
        }

    }

    private void changeInnings() {
        Team team = bowlingTeam;
        bowlingTeam = battingTeam;
        battingTeam = team;
        this.InningsNo = 2;
    }

    private void updateBattingScoreCard(Ball ball) {
        onStrikePlayer.totalRunsScored = onStrikePlayer.getTotalRunsScored() + ball.getRunsScored();
        onStrikePlayer.totalBallsPlayed = onStrikePlayer.totalBallsPlayed + 1;
        ScoreCard battingScoreCard = matchScoreCard.get(battingTeam).BattingScoreCard;
        ScoreCardEntry scoreCardEntry = battingScoreCard.scoreCardEntryList.get(onStrikePlayer);
        scoreCardEntry.totalRunsScored = scoreCardEntry.totalRunsScored + ball.getRunsScored();
        if (ball.isFour()) {
            scoreCardEntry.totalFours = scoreCardEntry.totalFours + 1;
        }
        if (ball.isSix()) {
            scoreCardEntry.totalSixes = scoreCardEntry.totalSixes + 1;
        }
        if (ball.isWicket()) {
            scoreCardEntry.isBowled = true;
            onStrikePlayer = getNextBatsmen();
        }
        if (ball.getBallNo() == 6 || ball.getRunsScored() % 2 == 1) {
            rotateStrike();
        }
    }

    public Player getNextBatsmen() {
        ScoreCard scoreCard = matchScoreCard.get(battingTeam).BattingScoreCard;
        Player player = null;
        for (Map.Entry entry : scoreCard.getScoreCardEntryList().entrySet()) {
            player = (Player) entry.getKey();
            ScoreCardEntry scoreCardEntry = (ScoreCardEntry) entry.getValue();
            if (!scoreCardEntry.isBowled) {
                return player;
            }
        }
        return player;
    }

    public Player getNextBowler() {
        return bowlingTeam.getPlayers().get(1);
    }

    public void rotateStrike() {
        Player temp = onStrikePlayer;
        onStrikePlayer = nonStrikePlayer;
        nonStrikePlayer = temp;
    }
}



