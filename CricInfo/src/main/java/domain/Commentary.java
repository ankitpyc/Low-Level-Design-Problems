package domain;

import java.util.List;

public class Commentary {
    List<Ball> ballList;

    public Commentary(List<Ball> ballList) {
        this.ballList = ballList;
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public void setBallList(List<Ball> ballList) {
        this.ballList = ballList;
    }
}
