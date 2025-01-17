package io.muzoo.ssc.design.decorator;

public class LoggingCalculator implements Calculator {

    private Calculator calculator;

    public LoggingCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int calculate(int a, int b) {
        System.out.println("method is being called.");
        return calculator.calculate(a, b);
    }
}
