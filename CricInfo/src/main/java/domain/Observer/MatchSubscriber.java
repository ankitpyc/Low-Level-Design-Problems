package domain.Observer;

import domain.Ball;

public interface MatchSubscriber {
    void onBallDeliveryChange(Ball ball);
}
