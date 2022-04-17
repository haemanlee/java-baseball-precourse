package baseball.service;

import baseball.model.Balls;
import baseball.model.PlayResult;
import baseball.view.InputView;
import baseball.view.ResultView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class PlayBaseballGame {

    public void play(){
        Balls com = new Balls(Randoms.pickUniqueNumbersInRange(1,9,3));

        PlayResult playResult;
        do {
            InputView.inputNumbers();
            playResult = com.play(InputView.getBalls());

            ResultView.printGameOver(playResult.playScore());
        } while (!playResult.isGameOver());
    }

    public boolean isContinue() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();
        if (userInput.equals("1")) {
            return true;
        }
        if (userInput.equals("2")) {
            return false;
        }
        throw new IllegalArgumentException("1 혹은 2을 입력하세요.");
    }
}
