package baseball.model;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BallTest {

    /**
     * 1. 입력되는 숫자가 최소 1, 최대 9이어야 한다. (아닌 경우 IllegalArgumentException 적용)
     */
    @DisplayName("볼 숫자 최소,최대 테스트")
    @Test
    void ball_number_valid_test(){
        Ball okBall1 = new Ball(1);
        Ball okBall2 = new Ball(9);

        assertThatThrownBy(() -> new Ball(0))
                .isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining("입력되는 숫자가 최소 1, 최대 9이어야 합니다.");

    }
}