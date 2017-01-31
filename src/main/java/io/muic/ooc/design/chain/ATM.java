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
public class ATM {
    public static void main(String[] args) {
        Cash1000BanknoteHandler cash1000BanknoteHandler = new Cash1000BanknoteHandler();
        Cash500BanknoteHandler cash500BanknoteHandler = new Cash500BanknoteHandler();
        Cash100BanknoteHandler cash100BanknoteHandler = new Cash100BanknoteHandler();
        Cash50BanknoteHandler cash50BanknoteHandler = new Cash50BanknoteHandler();
        Cash20BanknoteHandler cash20BanknoteHandler = new Cash20BanknoteHandler();
        Cash10CoinHandler cash10CoinHandler = new Cash10CoinHandler();
        
        cash1000BanknoteHandler.setNextCashHandler(cash500BanknoteHandler);
        cash500BanknoteHandler.setNextCashHandler(cash100BanknoteHandler);
        cash100BanknoteHandler.setNextCashHandler(cash50BanknoteHandler);
        cash50BanknoteHandler.setNextCashHandler(cash20BanknoteHandler);
        cash20BanknoteHandler.setNextCashHandler(cash10CoinHandler);
        
        System.out.println("Try 100 baht ====");
        cash1000BanknoteHandler.handle(100);
        
        System.out.println("Try 10000 baht ====");
        cash1000BanknoteHandler.handle(10000);
        
        System.out.println("Try 2340 baht ====");
        cash1000BanknoteHandler.handle(2340);
        
        System.out.println("Try 33310 baht ====");
        cash1000BanknoteHandler.handle(33310);
    }
   
}
