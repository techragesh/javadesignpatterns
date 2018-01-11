package com.tech.creational.abstractfactorypattern;

public interface KingdomFactory {

    Castle getCastle();
    King getKing();
    Army getArmy();
}
