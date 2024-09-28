package domain.ScoreCard;

import domain.Player;

public class ScoreCardEntry {

    Player player;
    int totalRunsScored;
    int totalBallsPlayed;
    int totalSixes;
    int totalFours;
    int totalDoubles;
    int totalSingles;
    int totalOversBowled;
    int totalWicketsTaken;
    boolean isBowled;
    Player wicketTakenBy;

    public ScoreCardEntry(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getTotalRunsScored() {
        return totalRunsScored;
    }

    public void setTotalRunsScored(int totalRunsScored) {
        this.totalRunsScored = totalRunsScored;
    }

    public int getTotalBallsPlayed() {
        return totalBallsPlayed;
    }

    public void setTotalBallsPlayed(int totalBallsPlayed) {
        this.totalBallsPlayed = totalBallsPlayed;
    }

    public int getTotalSixes() {
        return totalSixes;
    }

    public void setTotalSixes(int totalSixes) {
        this.totalSixes = totalSixes;
    }

    public int getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(int totalFours) {
        this.totalFours = totalFours;
    }

    public int getTotalDoubles() {
        return totalDoubles;
    }

    public void setTotalDoubles(int totalDoubles) {
        this.totalDoubles = totalDoubles;
    }

    public int getTotalSingles() {
        return totalSingles;
    }

    public void setTotalSingles(int totalSingles) {
        this.totalSingles = totalSingles;
    }

    public int getTotalOversBowled() {
        return totalOversBowled;
    }

    public void setTotalOversBowled(int totalOversBowled) {
        this.totalOversBowled = totalOversBowled;
    }

    public int getTotalWicketsTaken() {
        return totalWicketsTaken;
    }

    public void setTotalWicketsTaken(int totalWicketsTaken) {
        this.totalWicketsTaken = totalWicketsTaken;
    }

    public Player getWicketTakenBy() {
        return wicketTakenBy;
    }

    public void setWicketTakenBy(Player wicketTakenBy) {
        this.wicketTakenBy = wicketTakenBy;
    }
}
