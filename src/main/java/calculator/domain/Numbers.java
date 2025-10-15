package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    protected static Numbers from(String[] expressionNumbers) {
        NumberValidator validator = new NumberValidator();
        List<Integer> numbers = new ArrayList<>();

        for(String n : expressionNumbers) {
            if(n.isEmpty()) {
                continue;
            }

            int num = validator.stringToInt(n);
            validator.positiveNum(num);
            numbers.add(num);
        }
        return new Numbers(numbers);
    }

    public int sum() {
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
