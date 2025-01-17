/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.iterator;

import java.io.File;

/**
 *
 * @author gigadot
 */
public class DirectoryIteratorExample {

    public static void main(String[] args) {
        DirectoryIterator di = new DirectoryIterator(new File("target/"));
        while (di.hasNext()) {
            File f = di.next();
            System.out.println(f);
        }
    }

}
