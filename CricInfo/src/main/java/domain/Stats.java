package domain;

public abstract class Stats {
    public Integer totalMatchesPlayed;
    public Integer totalWicketsTaken;
    public Integer totalRunsScored;
    public Integer totalFours;
    public Integer totalSixes;
    public Double totalOversBowled;
    public Integer totalBallsPlayed;
    public Stats(Integer totalMatchesPlayed, Integer totalWicketsTaken, Integer totalRunsScored, Integer totalFours, Integer totalSixes,Double totalOversBowled) {
        this.totalMatchesPlayed = totalMatchesPlayed;
        this.totalWicketsTaken = totalWicketsTaken;
        this.totalRunsScored = totalRunsScored;
        this.totalFours = totalFours;
        this.totalSixes = totalSixes;
        this.totalOversBowled = totalOversBowled;
    }

    public Integer getTotalMatchesPlayed() {
        return totalMatchesPlayed;
    }

    public void setTotalMatchesPlayed(Integer totalMatchesPlayed) {
        this.totalMatchesPlayed = totalMatchesPlayed;
    }

    public Integer getTotalWicketsTaken() {
        return totalWicketsTaken;
    }

    public void setTotalWicketsTaken(Integer totalWicketsTaken) {
        this.totalWicketsTaken = totalWicketsTaken;
    }

    public Integer getTotalRunsScored() {
        return totalRunsScored;
    }

    public void setTotalRunsScored(Integer totalRunsScored) {
        this.totalRunsScored = totalRunsScored;
    }

    public Integer getTotalFours() {
        return totalFours;
    }

    public void setTotalFours(Integer totalFours) {
        this.totalFours = totalFours;
    }

    public Integer getTotalSixes() {
        return totalSixes;
    }

    public void setTotalSixes(Integer totalSixes) {
        this.totalSixes = totalSixes;
    }

    public Double getTotalOversBowled() {
        return totalOversBowled;
    }

    public void setTotalOversBowled(Double totalOversBowled) {
        this.totalOversBowled = totalOversBowled;
    }
}
