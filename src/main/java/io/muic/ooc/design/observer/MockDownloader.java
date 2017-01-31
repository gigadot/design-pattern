/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.observer;

import java.util.Observable;

/**
 *
 * @author gigadot
 */
public class MockDownloader extends Observable {

    public void download() {
        for (int i = 0; i < 100; i++) {
            // do mock download by sleeping
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
            setChanged();
            notifyObservers(i);
        }
    }

}
