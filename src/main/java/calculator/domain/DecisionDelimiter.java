package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecisionDelimiter {
    private static final String START_CUSTOM_DELIMITER = "//";
    private static final String DEFAULT_DELIMITER = "[,:]";
    private static final String CUSTOM_DELIMITER = "^//(.*)\\\\n(.*)$";
    private final String input;

    public DecisionDelimiter(String input) {
        this.input = input;
    }

    public String customDelimiter() {
        String delimiter = DEFAULT_DELIMITER;
        if(input.startsWith(START_CUSTOM_DELIMITER)) {
            Pattern pattern = Pattern.compile(CUSTOM_DELIMITER, Pattern.DOTALL);
            Matcher matcher = pattern.matcher(input);
            delimiter = matcher.find() ? DEFAULT_DELIMITER + "|" + Pattern.quote(matcher.group(1)) : DEFAULT_DELIMITER;
        }
        return delimiter;
    }

    public String extractExpression() {
        if(!input.startsWith(START_CUSTOM_DELIMITER)) {
            return input;
        }
        Pattern pattern = Pattern.compile(CUSTOM_DELIMITER, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            return matcher.group(2);
        }
        int newlineIndex = input.indexOf('\n');
        return newlineIndex >= 0 ? input.substring(newlineIndex + 1) : "";
    }
}
