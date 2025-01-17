/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.muzoo.ssc.design.abs.factory;

import io.muzoo.ssc.design.abs.factory.simulator.Simulator;

/**
 *
 * @author gigadot
 */
public interface SimulatorFactory {

    Simulator create();

}
