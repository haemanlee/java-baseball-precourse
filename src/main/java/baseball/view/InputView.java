package baseball.view;

import camp.nextstep.edu.missionutils.*;

public class InputView {
    public static String getBalls() {
        System.out.print("숫자를 입력해주세요 : ");
        String balls = Console.readLine();
        return balls;
    }
}
