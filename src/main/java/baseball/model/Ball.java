package baseball.model;

public class Ball {
    private static final int MAX_NUMBER = 9;
    private static final int MIN_NUMBER = 1;
    private final int position;
    private final int number;

    public Ball(int position, int number) {
        if(isValid(number)){
            throw new IllegalArgumentException("입력되는 숫자가 최소 1, 최대 9이어야 합니다.");
        }
        this.position = position;
        this.number = number;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber(){
        return number;
    }

    private boolean isValid(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }

    public Status play(Ball ball) {
        if(ball.getPosition() == position && ball.getNumber() == number){
            return Status.Strike;
        }
        if(ball.getNumber() == number){
            return Status.Ball;
        }
        return Status.Nothing;
    }
}
