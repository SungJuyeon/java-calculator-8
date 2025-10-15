package calculator;

import calculator.controller.CalculatorController;

public class Application {
    public static void main(String[] args) {
        CalculatorController calc = new CalculatorController();
        calc.start();
    }
}
