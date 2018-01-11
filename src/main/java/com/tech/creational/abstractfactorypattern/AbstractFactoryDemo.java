package com.tech.creational.abstractfactorypattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        KingdomFactory kingdomFactory = new ElsKingdomFactory();
        Castle castle = kingdomFactory.getCastle();
        King king = kingdomFactory.getKing();
        Army army = kingdomFactory.getArmy();

        castle.description();
        king.description();
        army.description();
    }
}
