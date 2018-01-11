package com.tech.creational.singletonpattern;

public class Singleton {

    //static in nature
    //volatile means, the value of this variable will never be cached thread locally,
    //all reads and writes will go straight to main memory.
    //Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
    private static volatile Singleton instance = null;

    //private constructor
    private Singleton(){

    }

    //static instance and threadsafe
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
