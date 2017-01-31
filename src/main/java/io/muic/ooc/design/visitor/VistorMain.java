/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.visitor;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.DirectoryWalker;

/**
 *
 * @author gigadot
 */
public class VistorMain {

    public static void main(String[] args) {
        DirectoryWalker directoryWalker = new DirectoryWalker() {
            @Override
            protected void handleEnd(Collection results) throws IOException {
                super.handleEnd(results); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            protected void handleDirectoryEnd(File directory, int depth, Collection results) throws IOException {
                super.handleDirectoryEnd(directory, depth, results); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            protected void handleFile(File file, int depth, Collection results) throws IOException {
                super.handleFile(file, depth, results); //To change body of generated methods, choose Tools | Templates.
            }

        };
    }
}
