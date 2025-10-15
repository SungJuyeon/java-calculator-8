package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputHandler {
    private static final String USER_INPUT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    public String userInput() {
        System.out.println(USER_INPUT_MESSAGE);
        return Console.readLine();
    }
}
