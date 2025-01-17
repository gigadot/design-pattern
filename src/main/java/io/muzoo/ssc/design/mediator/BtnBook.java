/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague

public class BtnBook extends JButton implements Command {

    private Mediator med;

    BtnBook(ActionListener al, Mediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }

    @Override
    public void execute() {
        med.book();
    }
    
}
