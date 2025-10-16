package calculator;

import calculator.domain.NumberValidator;
import calculator.view.InputHandler;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 커스텀_구분자_사용() {
        assertSimpleTest(() -> {
            run("//;\\n1");
            assertThat(output()).contains("결과 : 1");
        });
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("-1,2,3"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("문자열 입력 시 예외")
    void 문자열_입력_시_예외() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("//*\\n1@2"))
                .isInstanceOf(IllegalArgumentException.class)

        );
    }

    @ParameterizedTest
    @DisplayName("다양한 커스텀 구분자 테스트")
    @CsvSource(value = {"//*\\n1*2:3, 6", "//\\n1:2:5, 8"})
    void 다양한_커스텀_구분자_테스트(String input, int expected) {
        assertSimpleTest(() -> {
            run(input);
            assertThat(output()).contains("결과 : " + expected);
        });
    }


    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
