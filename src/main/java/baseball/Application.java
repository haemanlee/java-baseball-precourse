package baseball;

import baseball.model.Balls;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Balls balls = new Balls(InputView.getBalls());
    }
}
