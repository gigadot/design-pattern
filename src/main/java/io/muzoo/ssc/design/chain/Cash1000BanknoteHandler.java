/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.chain;

/**
 *
 * @author gigadot
 */
public class Cash1000BanknoteHandler extends CashHandler {

    @Override
    protected int doHandle(int amount) {
        int numBanknotes = amount / 1000;
        System.out.println("Number of 1000-baht banknotes: " + numBanknotes);
        return amount % 1000;
    }
    
}
