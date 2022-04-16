package baseball.view;

import baseball.model.Balls;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    @DisplayName("3자리 볼 생성 실패 테스트")
    @Test
    void balls_generate_fail_test() {
        assertThatThrownBy(() -> InputView.getBalls("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력되는 값이 3자리 이어야 합니다.");
    }
}