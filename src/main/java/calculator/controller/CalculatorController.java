package calculator.controller;

import calculator.view.InputHandler;

public class CalculatorController {
    private InputHandler inputHandler;

    public CalculatorController() {
        inputHandler = new InputHandler();
    }

    public void start() {
        String input = inputHandler.userInput();

    }
}
