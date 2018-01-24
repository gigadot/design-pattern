/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.visitor;

import java.io.File;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author gigadot
 */
public class ClassFileVisitor implements FileVisitor {

    @Override
    public void visit(File file) {
        if (file != null && file.isFile() && "class".equals(FilenameUtils.getExtension(file.getName()))) {
            System.out.println("Found class file: " + file.getAbsolutePath());
        }
    }
    
}
