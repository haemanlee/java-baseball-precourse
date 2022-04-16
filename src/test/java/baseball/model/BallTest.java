package baseball.model;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {

    private Ball com;

    @BeforeEach
    void set_up(){
        com = new Ball(1,4);
    }

    /**
     * 1. 입력되는 숫자가 최소 1, 최대 9이어야 한다. (아닌 경우 IllegalArgumentException 적용)
     */
    @DisplayName("볼 숫자 최소,최대 테스트")
    @Test
    void ball_number_valid_test(){
        assertThatThrownBy(() -> new Ball(1, 0))
                .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("입력되는 숫자가 최소 1, 최대 9이어야 합니다.");

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
        Status status = com.play(new Ball(2,4));
        Assertions.assertThat(status).isEqualTo(Status.Ball);
    }

    @DisplayName("스트라이크 테스트")
    @Test
    void strike_test(){
        Status status = com.play(new Ball(1,4));
        Assertions.assertThat(status).isEqualTo(Status.Strike);
    }


}