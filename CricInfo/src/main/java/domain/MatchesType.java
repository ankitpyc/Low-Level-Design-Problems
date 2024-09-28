package domain;

public enum MatchesType {


    ONE_DAY(50, 1), TEST_CRICKET(-1, 5), T20(20, 1);


    public int noOfOvers;
    public int noOfDays;

    MatchesType(int noOfOvers, int noOfDays) {
        this.noOfDays = noOfDays;
        this.noOfOvers = noOfOvers;
    }

}
