package baseball.service;

import baseball.model.Balls;
import baseball.constant.Message;
import baseball.model.PlayResult;
import baseball.view.InputView;
import baseball.view.ResultView;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class PlayBaseballGame {
    public void play(){
        List<Integer> computerBalls = getComputerBalls();
        Balls com = new Balls(computerBalls);

        PlayResult playResult;
        do {
            InputView.inputNumbers();
            playResult = com.play(InputView.getBalls());

            ResultView.printGameOver(playResult.playScore());
        } while (!playResult.isGameOver());
    }

    private List<Integer> getComputerBalls() {
        List<Integer> computerBalls = new ArrayList<>();
        computerBalls.add(Randoms.pickNumberInRange(Message.MIN_NUMBER, Message.MAX_NUMBER));
        computerBalls.add(Randoms.pickNumberInRange(Message.MIN_NUMBER, Message.MAX_NUMBER));
        computerBalls.add(Randoms.pickNumberInRange(Message.MIN_NUMBER, Message.MAX_NUMBER));
        return computerBalls;
    }

    public boolean isContinue() {
        System.out.println(Message.ASK_CONTINUE);
        String userInput = Console.readLine();
        if (userInput.equals(Message.CONTINUE)) {
            return true;
        }
        if (userInput.equals(Message.STOP)) {
            return false;
        }
        throw new IllegalArgumentException("1 혹은 2을 입력하세요.");
    }
}
