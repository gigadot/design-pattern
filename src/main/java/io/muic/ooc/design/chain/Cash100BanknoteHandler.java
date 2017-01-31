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
public class Cash100BanknoteHandler extends CashHandler {

    @Override
    protected int doHandle(int amount) {
        int numBanknotes = amount / 100;
        System.out.println("Number of 100-baht banknotes: " + numBanknotes);
        return amount % 100;
    }
    
}
