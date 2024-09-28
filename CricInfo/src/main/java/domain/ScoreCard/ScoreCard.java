package domain.ScoreCard;

import java.util.List;

public class ScoreCard {
    List<ScoreCardEntry> scoreCardEntryList;

    public ScoreCard(List<ScoreCardEntry> scoreCardEntryList) {
        this.scoreCardEntryList = scoreCardEntryList;
    }

    public List<ScoreCardEntry> getScoreCardEntryList() {
        return scoreCardEntryList;
    }

    public void setScoreCardEntryList(List<ScoreCardEntry> scoreCardEntryList) {
        this.scoreCardEntryList = scoreCardEntryList;
    }
}
