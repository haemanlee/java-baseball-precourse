package baseball.view;

import baseball.constant.Message;
import baseball.utils.Validate;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static String inputNumbers;

    public static List<Integer> getBalls() {

        String[] numbers = inputNumbers.split("");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int ball = Integer.parseInt(numbers[i]);
            if( Validate.isUnderNineAndOverOne(ball) ) {
                result.add(ball);
            }
        }
        return result;
    }

    public static void inputNumbers() {
        System.out.print(Message.ASK_NUMBER);
        if(Validate.isEqualsToThreeLength(inputNumbers) || Validate.isNotExistDuplicate(inputNumbers) ){
            inputNumbers = Console.readLine();
        }
    }



}
