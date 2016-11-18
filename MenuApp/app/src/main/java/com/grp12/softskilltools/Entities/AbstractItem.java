package com.grp12.softskilltools.Entities;



/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public abstract class AbstractItem {
    public double cost;
    public enum testType{DISC,BELBIN,THREESIXTY};
    public String id;
    public boolean isUsed;
    protected testType type;

    public AbstractItem(double cost, testType type, String id, boolean isUsed){
        this.cost = cost;
        this.id = id;
        this.isUsed = isUsed;
        this.type = type;
    }
    public testType getTestType(){
        return type;
    }
    @Override
    public String toString(){
        switch(type){
            case DISC:
                return "testType=DISC";
            case BELBIN:
                return "testType=BELBIN";
            case THREESIXTY:
                return "testType=THREESIXTY";
            default:
                return "";
        }
    }

}
