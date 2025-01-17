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
public abstract class CashHandler {

    private CashHandler nextCashHandler;

    /**
     *
     * @param amount to be paid by this bill type
     * @return remaining amount that cannot be paid by this bill type
     */
    protected abstract int doHandle(int amount);

    public int handle(int amount) {
        int remainingAmount = doHandle(amount);
        if (null != nextCashHandler) {
            return nextCashHandler.handle(remainingAmount);
        } else {
            return 0;
        }
    }

    public void setNextCashHandler(CashHandler nextCashHandler) {
        this.nextCashHandler = nextCashHandler;
    }

}
