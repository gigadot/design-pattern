/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.command;

/**
 *
 * @author gigadot
 */
public class LightOnCommand implements Command {

    @Override
    public void apply() {
        System.out.println("Light turned on");
    }
    
}
