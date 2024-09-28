package domain;

public class Ball {
    int ballNo;
    boolean isWicket;
    int runsScored;
    boolean isFour;
    boolean isSix;
    WicketType wicketType;

    public Ball(int index) {
        this.ballNo = index;
    }

    public int getBallNo() {
        return ballNo;
    }

    public void setBallNo(int ballNo) {
        this.ballNo = ballNo;
    }

    public boolean isFour() {
        return isFour;
    }

    public void setFour(boolean four) {
        isFour = four;
    }

    public boolean isSix() {
        return isSix;
    }

    public void setSix(boolean six) {
        isSix = six;
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

    public boolean getIsFour() {
        return isFour;
    }

    public void setIsFour(boolean isFour) {
        this.isFour = isFour;
    }

    public boolean getIsSix() {
        return isSix;
    }

    public void setIsSix(boolean isSix) {
        this.isSix = isSix;
    }

    public WicketType getWicketType() {
        return wicketType;
    }

    public void setWicketType(WicketType wicketType) {
        this.wicketType = wicketType;
    }
}
