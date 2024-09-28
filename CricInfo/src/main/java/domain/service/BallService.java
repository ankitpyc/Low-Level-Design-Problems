package domain.service;

import domain.Ball;

import java.util.List;
import java.util.Random;

public class BallService {

    private static final int[] RunsScored = {-1, 0, 1, 2, 3, 4, 6};

    public static Ball PlayBall(int index) {
        Random random = new Random();
        Ball ball = new Ball(index);
        int runsScored = -1 + random.nextInt(7);
        switch (runsScored) {
            case -1:
                ball.setRunsScored(0);
                ball.setWicket(true);
                break;
            case 4:
                ball.setIsFour(true);
                ball.setRunsScored(runsScored);
                break;
            case 6:
                ball.setIsSix(true);
                ball.setRunsScored(runsScored);
                break;
            default:
                ball.setRunsScored(runsScored);
        }

        return ball;
    }
}
