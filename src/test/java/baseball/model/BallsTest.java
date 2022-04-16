package baseball.model;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BallsTest {

    @DisplayName("3자리 볼 생성 성공 테스트")
    @Test
    void balls_generate_pass_test() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Balls balls = new Balls(list);
        assertThat(balls.getBalls().size()).isEqualTo(3);
    }

}