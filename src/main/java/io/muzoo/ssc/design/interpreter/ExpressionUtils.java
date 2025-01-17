/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.interpreter;

/**
 *
 * @author gigadot
 */
public class ExpressionUtils {

    public static boolean isOperator(String s) {
        return (s.equals("+") || s.equals("-") || s.equals("*"));
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Subtract(left, right);
            case "*":
                return new Product(left, right);
        }
        return null;
    }

}
