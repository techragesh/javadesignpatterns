package com.tech.creational.abstractfactorypattern;

public class ElsKingdomFactory implements KingdomFactory {
    public Castle getCastle() {
        return new ElsCastle();
    }

    public King getKing() {
        return new ElsKing();
    }

    public Army getArmy() {
        return new ElsArmy();
    }
}
