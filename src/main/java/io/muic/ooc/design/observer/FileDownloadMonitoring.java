/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author gigadot
 */
public class FileDownloadMonitoring {

    public static void main(String[] args) {
        System.out.println("Do download without observer");
        MockDownloader mockDownloader = new MockDownloader();
        mockDownloader.download();

        System.out.println("Do download with observer");
        mockDownloader.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object progress) {
                System.out.print("Progress is " + progress + "%\r");
            }
        });
        mockDownloader.download();
    }
}
