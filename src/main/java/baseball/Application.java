package baseball;


import baseball.service.PlayBaseballGame;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        PlayBaseballGame playBaseballGame;

        do {
            playBaseballGame = new PlayBaseballGame();
            playBaseballGame.play();
        } while (playBaseballGame.isContinue());
    }
}
