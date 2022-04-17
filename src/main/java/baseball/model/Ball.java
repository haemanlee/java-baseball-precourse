package baseball.model;

import baseball.constant.Message;

public class Ball {

    private final int position;
    private final int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }

    public int getPosition() {
        return position;
    }

    public int getNumber(){
        return number;
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
