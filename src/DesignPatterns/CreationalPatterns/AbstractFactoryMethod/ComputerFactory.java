package DesignPatterns.CreationalPatterns.AbstractFactoryMethod;

import DesignPatterns.CreationalPatterns.FactoryMethod.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
