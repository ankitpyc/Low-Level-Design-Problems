package domain.ScoreCard;

import domain.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreCard {
    Map<Player,ScoreCardEntry> scoreCardEntryList;
    Integer totalOversBowled;
    Integer totalWicketsTaken;
    Integer totalOversPlayed;
    Integer totalRunsScored;

    public ScoreCard(List<ScoreCardEntry> scoreCardEntryList) {
        this.scoreCardEntryList = new HashMap<>();
    }

    public Map<Player,ScoreCardEntry> getScoreCardEntryList() {
        return scoreCardEntryList;
    }

    public void setScoreCardEntryList(Map<Player,ScoreCardEntry> scoreCardEntryList) {
        this.scoreCardEntryList = scoreCardEntryList;
    }

    public Integer getTotalOversBowled() {
        return totalOversBowled;
    }

    public void setTotalOversBowled(Integer totalOversBowled) {
        this.totalOversBowled = totalOversBowled;
    }

    public Integer getTotalWicketsTaken() {
        return totalWicketsTaken;
    }

    public void setTotalWicketsTaken(Integer totalWicketsTaken) {
        this.totalWicketsTaken = totalWicketsTaken;
    }

    public Integer getTotalOversPlayed() {
        return totalOversPlayed;
    }

    public void setTotalOversPlayed(Integer totalOversPlayed) {
        this.totalOversPlayed = totalOversPlayed;
    }

    public Integer getTotalRunsScored() {
        return totalRunsScored;
    }

    public void setTotalRunsScored(Integer totalRunsScored) {
        this.totalRunsScored = totalRunsScored;
    }
}
