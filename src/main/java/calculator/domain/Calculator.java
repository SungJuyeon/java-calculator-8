package calculator.domain;

import java.util.ArrayList;
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
        String extractExpression = delimiter.extractExpression();

        if(extractExpression.isEmpty()) {
            return 0;
        }

        String[] expressionNumbers = extractExpression.split(customDelimiter);
        Numbers numbers = Numbers.from(expressionNumbers);

        return 0;
    }
}
