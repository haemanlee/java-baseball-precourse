package baseball;

import baseball.model.Balls;
import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Balls computer = new Balls(Randoms.pickUniqueNumbersInRange(1,9,3));

        Balls balls = new Balls(InputView.getBalls(InputView.getInput()));
    }
}
