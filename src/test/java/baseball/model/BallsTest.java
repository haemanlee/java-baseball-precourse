package baseball.model;
import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class BallsTest {

    private Balls com;

    @BeforeEach
    void setUp(){
        com = new Balls(Arrays.asList(1,2,3));
    }

    @DisplayName("3자리 볼 생성 성공 테스트")
    @Test
    void balls_generate_pass_test() {
        assertThat(com.getBalls().size()).isEqualTo(3);
    }

    @DisplayName("낫싱 테스트")
    @Test
    void nothing_test(){
        Status status = com.play(new Ball(1,5));
        Assertions.assertThat(status).isEqualTo(Status.Nothing);
    }

    @DisplayName("볼 테스트")
    @Test
    void ball_test(){
        Status status = com.play(new Ball(1,2));
        Assertions.assertThat(status).isEqualTo(Status.Ball);
    }

    @DisplayName("스트라이크 테스트")
    @Test
    void strike_test(){
        Status status = com.play(new Ball(1,1));
        Assertions.assertThat(status).isEqualTo(Status.Strike);
    }
}