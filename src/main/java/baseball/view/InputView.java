package baseball.view;

import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final int BALL_COUNT = 3;

    public static List<Integer> getBalls(String input) {
        if(isValid(input)){
            throw new IllegalArgumentException("입력되는 값이 3자리 이어야 합니다.");
        }
        String[] numbers = input.split("");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            result.add(Integer.parseInt(numbers[i]));
        }
        return result;
    }

    public static String getInput() {
        System.out.print("숫자를 입력해주세요 : ");
        String balls = Console.readLine();
        return balls;
    }

    private static boolean isValid(String inputNumbers) {
        return inputNumbers.length() != BALL_COUNT;
    }

}
