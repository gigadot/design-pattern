package io.muic.ooc.design.decorator;

public class AdditionCalculator implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
