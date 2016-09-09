package com.company;

/**
 * Created by Taras on 05.09.2016.
 */
public class Fish extends Pet {
    int currDepth;
    public int dive (int howDepth){
        currDepth = currDepth + howDepth;
        System.out.println("i dive dsdsds into " + howDepth+ " and i'dsdm on " +currDepth);
        return currDepth;
            }

}
