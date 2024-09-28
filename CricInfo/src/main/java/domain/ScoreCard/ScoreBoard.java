package domain.ScoreCard;

public class ScoreBoard {
    ScoreCard BattingScoreCard;
    ScoreCard BowlingScoreCard;

    public ScoreCard getBattingScoreCard() {
        return BattingScoreCard;
    }

    public void setBattingScoreCard(ScoreCard battingScoreCard) {
        BattingScoreCard = battingScoreCard;
    }

    public ScoreCard getBowlingScoreCard() {
        return BowlingScoreCard;
    }

    public void setBowlingScoreCard(ScoreCard bowlingScoreCard) {
        BowlingScoreCard = bowlingScoreCard;
    }
}
