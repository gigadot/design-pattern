/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.mediator;

import java.awt.event.ActionListener;
import javax.swing.JButton;

//A concrete colleague

public class BtnSearch extends JButton implements Command {

    private Mediator med;

    public BtnSearch(ActionListener al, Mediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    @Override
    public void execute() {
        med.search();
    }
    
}
