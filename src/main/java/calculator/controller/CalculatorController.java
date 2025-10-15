package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.DecisionDelimiter;
import calculator.view.InputHandler;
import calculator.view.OutputHandler;

public class CalculatorController {
    private InputHandler inputHandler;

    public CalculatorController() {
        inputHandler = new InputHandler();
    }

    public void start() {
        String userInput = inputHandler.userInput();
        Calculator calc = new Calculator(userInput);

        int output = calc.calculate();
    }
}
