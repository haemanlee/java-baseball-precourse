package baseball.model;

public class Ball {
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;
    private final int number;

    public Ball(int number) {
        if(isValid(number)){
            throw new IllegalArgumentException("입력되는 숫자가 최소 1, 최대 9이어야 합니다.");
        }
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    private boolean isValid(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }
}
