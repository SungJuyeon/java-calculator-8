package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = new ArrayList<>(numbers);
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
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
