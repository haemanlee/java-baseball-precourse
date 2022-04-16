package baseball.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {

    private final List<Ball> balls = new ArrayList<>();

    public Balls(List<Integer> inputNumbers) {
        for (int i = 0; i < inputNumbers.size(); i++) {
            balls.add(new Ball(i+1, inputNumbers.get(i)));
        }
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
        return balls.stream()
                .map(answer -> answer.play(ball))
                .filter(Status::isNotNothing)
                .findFirst()
                .orElse(Status.Nothing);
    }
}
