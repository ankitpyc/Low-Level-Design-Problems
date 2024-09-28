package domain;

public abstract class Stats {
    public Integer totalMatchesPlayed;
    public Integer totalWicketsTaken;
    public Integer totalRunsScored;

    public Stats(Integer totalMatchesPlayed, Integer totalWicketsTaken, Integer totalRunsScored) {
        this.totalMatchesPlayed = totalMatchesPlayed;
        this.totalWicketsTaken = totalWicketsTaken;
        this.totalRunsScored = totalRunsScored;
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
}
