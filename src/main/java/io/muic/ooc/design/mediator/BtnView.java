/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague
public class BtnView extends JButton implements Command {

    Mediator med;

    public BtnView(ActionListener al, Mediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }

    @Override
    public void execute() {
        med.view();
    }

}
