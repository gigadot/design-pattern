/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muic.ooc.design.mediator;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author gigadot
 */
public class LblDisplay extends JLabel {
    
    private Mediator med;

    public LblDisplay(Mediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }
    
}
