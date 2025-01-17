/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.visitor;

import io.muzoo.ssc.design.iterator.DirectoryIterator;
import java.io.File;

/**
 *
 * @author gigadot
 */
public class VisitorExample {

    private static void doWithoutVisitor() {
        DirectoryIterator di = new DirectoryIterator(new File("target/"));
        while (di.hasNext()) {
            File f = di.next();
            System.out.println("Found class file: " + f.getAbsolutePath());
        }

        di = new DirectoryIterator(new File("target/"));
        while (di.hasNext()) {
            File f = di.next();
            System.out.println("Fake removing class file: " + f.getAbsolutePath());
        }
    }

    private static void doWithVisitor() {
        Finder finder = new Finder();
        finder.accept(new ClassFileVisitor());
        finder.accept(new RemoveClassFileVisitor());
    }

    public static void main(String[] args) {
        doWithoutVisitor();
        doWithVisitor();
    }
}
