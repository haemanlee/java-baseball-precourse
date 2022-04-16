package baseball.model;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BallsTest {

    @DisplayName("3자리 볼 생성 성공 테스트")
    @Test
    void balls_generate_pass_test() {
        Balls balls = new Balls("123");
        assertThat(balls.getBalls().size()).isEqualTo(3);
    }

    @DisplayName("3자리 볼 생성 실패 테스트")
    @Test
    void balls_generate_fail_test() {
        assertThatThrownBy(() -> new Balls("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력되는 값이 3자리 이어야 합니다.");
    }


}