/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.visitor;

import io.muic.ooc.design.iterator.DirectoryIterator;
import java.io.File;

/**
 *
 * @author gigadot
 */
public class Finder {
    
    public void accept(FileVisitor visitor) {
        DirectoryIterator di = new DirectoryIterator(new File("target/"));
        while (di.hasNext()) {
            File f = di.next();
            visitor.visit(f);
        }
    }
}
