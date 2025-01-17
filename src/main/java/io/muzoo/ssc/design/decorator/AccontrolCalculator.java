package io.muzoo.ssc.design.decorator;

public class AccontrolCalculator implements Calculator {

    private Calculator calculator;

    public AccontrolCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int calculate(int a, int b) {
        if (a != b) {
            throw new RuntimeException("To use this calculator, a and b must be equal");
        }
        return calculator.calculate(a, b);
    }
}
