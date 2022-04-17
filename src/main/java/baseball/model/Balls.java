package baseball.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Integer> inputNumbers) {
        this.balls = mapBall(inputNumbers);
    }

    private static List<Ball> mapBall(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            balls.add(new Ball(i+1, answers.get(i)));
        }
        return balls;
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls);
    }

    public PlayResult play(List<Integer> userBalls){
        PlayResult playResult = new PlayResult();
        Balls tryBalls = new Balls(userBalls);
        for (Ball ball : balls) {
            Status status = tryBalls.play(ball);
            playResult.report(status);
        }
        return playResult;
    }

    Status play(Ball ball) {
        for (Ball answer : balls) {
            Status play = answer.play(ball);
            if (play.isNotNothing()) {
                return play;
            }
        }
        return Status.Nothing;
    }
}
