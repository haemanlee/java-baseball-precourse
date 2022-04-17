package baseball.model;

public class PlayResult {
    private int strike;
    private int ball;

    private StringBuilder sb;

    public void report(Status status) {
        if(status == Status.Strike) strike++;
        if(status == Status.Ball) ball++;
    }

    public boolean isGameOver(){
        if(this.strike == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }

    public String playScore() {
        sb = new StringBuilder();
        if(this.ball > 0){
            sb.append(this.ball+"볼");
        }
        if(this.strike > 0){
            if(sb.length() != 0){
                sb.append(" ");
            }
            sb.append(this.strike+"스트라이크");
        }
        if(sb.length() == 0){
            sb.append("낫싱");
        }
        return String.valueOf(sb);
    }
}
