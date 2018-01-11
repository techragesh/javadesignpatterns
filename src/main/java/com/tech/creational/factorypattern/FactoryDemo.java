package com.tech.creational.factorypattern;

public class FactoryDemo {

    public static void main(String[] args) {
        ITelevision iTelevision1 = TelevisionFactory.getTelevision(TelevisionType.SAMSUNG);
        iTelevision1.makeTelevision();

        ITelevision iTelevision2 = TelevisionFactory.getTelevision(TelevisionType.SONY);
        iTelevision2.makeTelevision();
    }
}
