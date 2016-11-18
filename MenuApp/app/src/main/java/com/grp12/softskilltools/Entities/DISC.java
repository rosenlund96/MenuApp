package com.grp12.softskilltools.Entities;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class DISC extends AbstractItem {
    private int Dom;
    private int Inf;
    private int Sta;
    private int Com;

    public DISC(int Dom,int Inf,int Sta,int Com, double cost, testType type,String id, boolean isUsed){
        super(cost, type, id, isUsed);
        this.Dom = Dom;
        this.Inf = Inf;
        this.Sta = Sta;
        this.Com = Com;
    }

    public int getDom() {
        return Dom;
    }

    public void setDom(int dom) {
        Dom = dom;
    }

    public int getInf() {
        return Inf;
    }

    public void setInf(int inf) {
        Inf = inf;
    }

    public int getSta() {
        return Sta;
    }

    public void setSta(int sta) {
        Sta = sta;
    }

    public int getCom() {
        return Com;
    }

    public void setCom(int com) {
        Com = com;
    }

    /**DISC TEST LOGIC BEGIN**/


    /**DISC TEST LOGIC END**/
}
