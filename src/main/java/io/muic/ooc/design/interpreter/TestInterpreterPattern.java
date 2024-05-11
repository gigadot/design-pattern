/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.interpreter;

import java.util.Stack;

/**
 *
 * @author gigadot
 */
public class TestInterpreterPattern {

    private static void evalNoInterpreter(String expressionStr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokenArray = expressionStr.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                int rightNumber = stack.pop();
                int leftNumber = stack.pop();
                Integer result = null;
                switch (s) {
                    case "-":
                        result = leftNumber - rightNumber;
                        break;
                    case "+":
                        result = leftNumber + rightNumber;
                        break;
                    case "*":
                        result = leftNumber * rightNumber;
                        break;
                    default:
                        throw new RuntimeException("Bad expression");
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        System.out.println("( " + expressionStr + " ): " + stack.pop());
    }

    private static void eval(String expressionStr) {
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = expressionStr.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("( " + expressionStr + " ): " + stack.pop().interpret());

    }

    public static void main(String[] args) {
        String tokenString = "7 3 - 2 1 + *";
        // (7 - 3) * (2 + 1)
        evalNoInterpreter(tokenString);
        eval(tokenString);
//        implementation above is too simple so it cannot evaluate the following more complex expression        
//        tokenString = "7 3 - 2 1 + * 2 1 + 3 2 * * ";
//        evalNoInterpreter(tokenString);
//        eval(tokenString);

    }

}
