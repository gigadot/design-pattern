/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gigadot
 */
public class Node {
    private List<Node> nodes = new ArrayList<>();
    
    public int size() {
        return nodes.size();
    }

    public boolean isEmpty() {
        return nodes.isEmpty();
    }

    public boolean add(Node e) {
        return nodes.add(e);
    }

    public void clear() {
        nodes.clear();
    }

    public boolean contains(Object o) {
        return nodes.contains(o);
    }

    public Node remove(int index) {
        return nodes.remove(index);
    }
}
