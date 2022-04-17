package baseball.model;

import baseball.constant.Message;

public class Ball {

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
        return number < Message.MIN_NUMBER || number > Message.MAX_NUMBER;
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
