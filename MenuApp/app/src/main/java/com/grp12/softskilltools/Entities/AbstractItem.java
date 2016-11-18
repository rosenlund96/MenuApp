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
    protected User owner;

    public AbstractItem(double cost, testType type, String id, boolean isUsed){
        this.cost = cost;
        this.id = id;
        this.isUsed = isUsed;
        this.type = type;
        this.owner = null;
    }
    public testType getTestType(){
        return type;
    }
    public User getOwner(){
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
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
