package domain.service;

import domain.Ball;
import domain.Match;
import domain.Observer.MatchObserver;
import domain.Player;
import domain.Team;

import java.util.ArrayList;
import java.util.List;

public class MatchService {

    Match match;

    List<MatchObserver> matchObserverList;

    public MatchService(Match match) {
        this.match = match;
        this.matchObserverList = new ArrayList<>();
        this.matchObserverList.add(match.getCommentary());

    }

    public void playMatch() {
        int totalNoOfOvers = match.getMatchesType().noOfOvers;
        Team battingteam = match.getScoreBoard().getFirstBattingTeam();
        Team bowlingteam = match.getScoreBoard().getFirstBowlingTeam();
        for (int over = 1; over < totalNoOfOvers; over++) {
            for (int i = 0; i < 6; i++) {
                Ball ball = BallService.PlayBall(i);
                OnBallChange(ball);
            }
        }
    }

    public void OnBallChange(Ball ball) {
        for (MatchObserver observer : matchObserverList) {
            observer.observe(ball);
        }
    }


}
