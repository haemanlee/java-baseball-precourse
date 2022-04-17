package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final int BALL_COUNT = 3;
    private static String inputNumbers;

    public static List<Integer> getBalls() {
        if( isValid(inputNumbers) ){
            throw new IllegalArgumentException("입력되는 값이 3자리 이어야 합니다.");
        }
        String[] numbers = inputNumbers.split("");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            result.add(Integer.parseInt(numbers[i]));
        }
        return result;
    }

    public static void inputNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        inputNumbers = Console.readLine();
    }

    private static boolean isValid(String inputNumbers) {
        return inputNumbers.length() != BALL_COUNT;
    }

}
