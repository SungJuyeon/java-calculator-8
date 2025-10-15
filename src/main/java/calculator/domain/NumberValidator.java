package calculator.domain;

public class NumberValidator {
    public int stringToInt(String s) {
        try {
            return Integer.parseInt(s.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public void positiveNum(int num) {
        if(!(num > 0))
            throw new IllegalArgumentException();
    }
}
