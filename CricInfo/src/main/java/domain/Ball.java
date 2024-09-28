package domain;

public class Ball {
    boolean isWicket;
    int runsScored;
    int isFour;
    int isSix;
    WicketType wicketType;

    public Ball(boolean isWicket, int runsScored, int isFour, int isSix, WicketType wicketType) {
        this.isWicket = isWicket;
        this.runsScored = runsScored;
        this.isFour = isFour;
        this.isSix = isSix;
        this.wicketType = wicketType;
    }

    public boolean isWicket() {
        return isWicket;
    }

    public void setWicket(boolean wicket) {
        isWicket = wicket;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getIsFour() {
        return isFour;
    }

    public void setIsFour(int isFour) {
        this.isFour = isFour;
    }

    public int getIsSix() {
        return isSix;
    }

    public void setIsSix(int isSix) {
        this.isSix = isSix;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }
}
