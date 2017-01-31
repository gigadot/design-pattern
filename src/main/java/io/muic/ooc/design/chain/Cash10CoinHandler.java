/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.chain;

/**
 *
 * @author gigadot
 */
public class Cash10CoinHandler extends CashHandler {

    @Override
    protected int doHandle(int amount) {
        int numBanknotes = amount / 10;
        System.out.println("Number of 10-baht coins: " + numBanknotes);
        return amount % 10;
    }
    
}
