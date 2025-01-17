/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.prototype;

import org.apache.commons.beanutils.BeanUtils;

/**
 *
 * @author gigadot
 */
public class Bacteria implements Cloneable {

    String dna;
    int age;

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //@Override
    public Bacteria clone() throws CloneNotSupportedException {
        try {
            return (Bacteria) BeanUtils.cloneBean(this);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
