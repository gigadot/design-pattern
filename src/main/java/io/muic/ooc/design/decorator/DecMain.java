package io.muic.ooc.design.decorator;

public class DecMain {

    public static void main(String[] args) {
        Calculator ac = new AccontrolCalculator(new AdditionCalculator());
        int val = ac.calculate(1, 2);
        System.out.println(val);
    }
}
