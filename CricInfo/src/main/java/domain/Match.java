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
    Commentary commentary;
    int []ballOutcomes = {-1,0,1,2,3,4,6};

    public void playMatch(){
        Team battingTeam = scoreBoard.getFirstBattingTeam();
        Team bowlingTeam = scoreBoard.getFirstBowlingTeam();
        int totalOvers = matchesType.noOfOvers;
        Player battingPlayer = battingTeam.players.get(0);
        Player bowlerPlayer = bowlingTeam.players.get(0);
        for(int over = 0;over < totalOvers;over++){
           for(int i = 0;i<6;i++){
               Ball ball = PlayBall()
           }
        }


    }

    private Ball PlayBall() {
        Random random = new Random();
        Ball ball = new Ball();
        int num  = -1 + random.nextInt(7);
        switch (num){
            case -1:
                ball.runsScored = 0;
                ball.isWicket = true;


        }

}
