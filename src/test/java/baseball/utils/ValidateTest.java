package baseball.utils;

import baseball.model.Ball;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {
    /**
     * 1. 입력되는 숫자가 최소 1, 최대 9이어야 한다. (아닌 경우 IllegalArgumentException 적용)
     */
    @DisplayName("볼 숫자 최소,최대 테스트")
    @Test
    void is_over_9_and_under_1(){
        assertThat(Validate.isUnderNineAndOverOne(1)).isTrue();
        assertThat(Validate.isUnderNineAndOverOne(9)).isTrue();
        assertThatThrownBy(() -> Validate.isUnderNineAndOverOne(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력되는 숫자가 최소 1, 최대 9이어야 합니다.");

    }
    @DisplayName("서로 다른 숫자 테스트")
    @Test
    void is_duplicate(){
        assertThat(Validate.isNotExistDuplicate("123")).isTrue();
        assertThatThrownBy(() -> Validate.isNotExistDuplicate("111"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 숫자중에 중복된 게 존재합니다.");
        assertThatThrownBy(() -> Validate.isNotExistDuplicate("122"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력된 숫자중에 중복된 게 존재합니다.");
    }

    @DisplayName("입력숫자 3자리 테스트")
    @Test
    void is_3length(){
        assertThatThrownBy(() -> Validate.isEqualsToThreeLength("12"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력되는 값이 3자리 이어야 합니다.");
        assertThatThrownBy(() -> Validate.isEqualsToThreeLength("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("입력되는 값이 3자리 이어야 합니다.");

    }
}