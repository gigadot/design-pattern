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
public class SimulatorMain {

    public static void main(String[] args) {
        if (args != null && args.length == 1) {
            String simType = args[0];
            SimulatorFactory simulatorFactory = null;
            switch (simType) {
                case "fast":
                    simulatorFactory = new FastSimulatorFactory();
                    break;
                case "slow":
                    simulatorFactory = new SlowSimulatorFactory();
                    break;
                default:
                    simulatorFactory = new SlowSimulatorFactory();
            }
            
            Simulator simulator = simulatorFactory.create();
            System.out.println(simulator);
        }
    }
}
