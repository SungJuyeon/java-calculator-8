package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.DecisionDelimiter;
import calculator.view.InputHandler;
import calculator.view.OutputHandler;

public class CalculatorController {
    private InputHandler inputHandler;
    private OutputHandler outputHandler;

    public CalculatorController() {
        inputHandler = new InputHandler();
        outputHandler = new OutputHandler();
    }

    public void start() {
        String userInput = inputHandler.userInput();
        Calculator calc = new Calculator(userInput);

        int output = calc.calculate();
        outputHandler.printOutput(output);
    }
}
