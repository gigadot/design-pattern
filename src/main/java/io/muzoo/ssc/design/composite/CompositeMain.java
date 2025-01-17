/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.composite;

/**
 *
 * @author gigadot
 */
public class CompositeMain {
    public static void main(String[] args) {
        Node n0 = new Node();
        
        Node n1 = new Node();
        Node n2 = new Node();
        
        n0.add(n1);
        n0.add(n2);
        
        Node n3 = new Node();
        n1.add(n3);

        // n0
        //  -- n1
        //      --n3
        //  -- n2

        
    }
}
