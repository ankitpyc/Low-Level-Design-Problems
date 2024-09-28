package domain;

import domain.Observer.MatchSubscriber;
import domain.ScoreCard.MatchScoreBoard;

import java.util.Random;

public class Match implements MatchSubscriber {

    MatchesType matchesType;
    Team playingTeam1;
    Team getPlayingTeam2;
    Team tossWinner;
    MatchScoreBoard scoreBoard;
    CommentaryService commentary;

    public MatchesType getMatchesType() {
        return matchesType;
    }

    public void setMatchesType(MatchesType matchesType) {
        this.matchesType = matchesType;
    }

    public Team getPlayingTeam1() {
        return playingTeam1;
    }

    public void setPlayingTeam1(Team playingTeam1) {
        this.playingTeam1 = playingTeam1;
    }

    public Team getGetPlayingTeam2() {
        return getPlayingTeam2;
    }

    public void setGetPlayingTeam2(Team getPlayingTeam2) {
        this.getPlayingTeam2 = getPlayingTeam2;
    }

    public Team getTossWinner() {
        return tossWinner;
    }

    public void setTossWinner(Team tossWinner) {
        this.tossWinner = tossWinner;
    }

    public MatchScoreBoard getScoreBoard() {
        return scoreBoard;
    }

    public void setScoreBoard(MatchScoreBoard scoreBoard) {
        this.scoreBoard = scoreBoard;
    }

    public CommentaryService getCommentary() {
        return commentary;
    }

    public void setCommentary(CommentaryService commentary) {
        this.commentary = commentary;
    }

    @Override
    public void onBallDeliveryChange(Ball ball) {

    }
}
