package baseball.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {
    private static final int BALL_COUNT = 3;
    private final List<Ball> balls = new ArrayList<>();

    public Balls(String inputNumbers) {
        if(isValid(inputNumbers)){
            throw new IllegalArgumentException("입력되는 값이 3자리 이어야 합니다.");
        }
        String[] numbers = inputNumbers.split("");
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(Integer.parseInt(numbers[i])));
        }
    }

    private boolean isValid(String inputNumbers) {
        return inputNumbers.length() != BALL_COUNT;
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls);
    }
}
