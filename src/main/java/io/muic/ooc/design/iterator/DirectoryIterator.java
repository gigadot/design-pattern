/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.iterator;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author gigadot
 */
public class DirectoryIterator implements Iterator<File> {

    private File root;
    
    private List<File> files;
    
    private int index = -1;

    public DirectoryIterator(File root) {
        this.root = root;
        files =  new ArrayList(FileUtils.listFiles(root, null, true));
    }

    @Override
    public boolean hasNext() {
        return (index < files.size() - 1);
    }

    @Override
    public File next() {
        index++;
        return files.get(index);
    }
    

}
