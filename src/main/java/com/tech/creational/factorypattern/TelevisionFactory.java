package com.tech.creational.factorypattern;

public class TelevisionFactory {

    public static ITelevision getTelevision(TelevisionType type) {
        switch (type){
            case SAMSUNG: return new SamsungTelevision();
            case SONY: return new SonyTelevision();
            default: return null;
        }
    }
}
