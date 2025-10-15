package calculator.domain;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    private final String input;

    public Calculator(String input) {
        this.input = input;
    }
    public int calculate() {
        if(input == null || input.isEmpty()) {
            return 0;
        }

        DecisionDelimiter delimiter = new DecisionDelimiter(input);
        String customDelimiter = delimiter.customDelimiter();

        return 0;
    }
}
