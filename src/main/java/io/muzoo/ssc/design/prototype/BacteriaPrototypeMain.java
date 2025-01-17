/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.prototype;

/**
 *
 * @author gigadot
 */
public class BacteriaPrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bacteria b1 = new Bacteria();
        b1.setAge(4);
        b1.setDna("verylongdnasequence");

        Bacteria b2 = b1.clone();

        System.out.println(b1 + " Age: " + b1.getAge());
        System.out.println(b2 + " Age: " + b2.getAge());

        b2.setAge(6);

        System.out.println(b1 + " Age: " + b1.getAge());
        System.out.println(b2 + " Age: " + b2.getAge());
    }
}
