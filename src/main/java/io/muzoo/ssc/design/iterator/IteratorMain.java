/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author gigadot
 */
public class IteratorMain {

    private static final List<String> fruites = new ArrayList<String>() {
        {
            add("Banana");
            add("Orange");
            add("Apple");
            add("Melon");
        }
    };

    public static void main(String[] args) {
        System.out.println("Basic for-loop ======");
        // Basic
        for (int i = 0; i < fruites.size(); i++) {
            String fruite = fruites.get(i);
            System.out.println("Fruite: " + fruite);
        }
        System.out.println("With iterator");
        // With iterator
        for (Iterator<String> iterator = fruites.iterator(); iterator.hasNext();) {
            String fruite = iterator.next();
            System.out.println("Fruite: " + fruite);
        }
        System.out.println("Remove with iterator");
        // Remove with iterator
        for (Iterator<String> iterator = fruites.iterator(); iterator.hasNext();) {
            String fruite = iterator.next();
            if (fruite.equals("Apple")) {
                iterator.remove();
            }
        }
        for (String fruite : fruites) {
            System.out.println("Fruite: " + fruite);
        }
    }
}
