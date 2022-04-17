package baseball.utils;

import baseball.constant.Message;

import java.util.HashSet;
import java.util.Set;

public class Validate {

    public static boolean isEqualsToThreeLength(String inputNumbers){
        if( !isValidSize(inputNumbers) ){
            throw new IllegalArgumentException("입력되는 값이 3자리 이어야 합니다.");
        }
        return true;
    }

    private static boolean isValidSize(String inputNumbers) {
        return inputNumbers.length() == Message.BALL_COUNT;
    }


    public static boolean isNotExistDuplicate(String inputNumbers) {
        if( isDuplicate(inputNumbers) ){
            throw new IllegalArgumentException("입력된 숫자중에 중복된 게 존재합니다.");
        }
        return true;
    }

    private static boolean isDuplicate(String inputNumbers) {
        String[] inputList = inputNumbers.split("");
        Set<String> duplicateCheckSet = new HashSet<>();
        for (String number : inputList) {
            if(duplicateCheckSet.contains(number)){
                return true;
            }
            duplicateCheckSet.add(number);
        }
        return false;
    }

    public static boolean isUnderNineAndOverOne(int ballNumber){
        if( !isValidNumberLimit(ballNumber) ){
            throw new IllegalArgumentException("입력되는 숫자가 최소 1, 최대 9이어야 합니다.");
        }
        return true;
    }

    private static boolean isValidNumberLimit(int number) {
        return number >= Message.MIN_NUMBER & number <= Message.MAX_NUMBER;
    }

}
