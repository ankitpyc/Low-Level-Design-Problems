package domain;

import domain.Observer.MatchObserver;

import java.util.List;

public class CommentaryService implements MatchObserver {


    @Override
    public void observe(Ball ball) {
        PlayCommentary(ball);
    }

    public void PlayCommentary(Ball ball) {

    }
}
