package baseball.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {

    private final List<Ball> balls = new ArrayList<>();

    public Balls(List<Integer> inputNumbers) {
        for (Integer inputNumber : inputNumbers) {
            balls.add(new Ball(inputNumber));
        }
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls);
    }
}
