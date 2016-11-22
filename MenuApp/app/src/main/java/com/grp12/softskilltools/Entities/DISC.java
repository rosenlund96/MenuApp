package com.grp12.softskilltools.Entities;

import com.grp12.softskilltools.resources.DISC_Data;

/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class DISC extends AbstractItem {
    private int Dom;
    private int Inf;
    private int Sta;
    private int Com;
    private boolean isUsed;
    private int Complete;
    private final int totalQuestions = 72;
    public static Question[] questions;


    public DISC(double cost, boolean isUsed, String productName, String description ) {
        super(cost, isUsed, productName, description);
        Dom = 0;
        Inf = 0;
        Sta = 0;
        Com = 0;

        initialize();

    }

    public int getDom() {

        return Dom;
    }

    public void setDom(int dom) {

        this.Dom += dom;
    }

    public int getInf() {

        return Inf;
    }

    public void setInf(int inf) {

        this.Inf += inf;
    }

    public int getSta() {

        return Sta;
    }

    public void setSta(int sta) {

        this.Sta += sta;
    }

    public int getCom() {

        return Com;
    }

    public void setCom(int com) {

        this.Com += com;
    }


    public void initialize(){
        questions = new Question[totalQuestions];
        for (int i = 0; i < totalQuestions; i++){
            questions[i] = new Question(DISC_Data.DISCWord_Data[i],DISC_Data.QuestionNo_DATA[i],DISC_Data.DISCTYPE_Data[i]);
        }
    }

    /**DISC TEST LOGIC BEGIN**/
    public void setScore(){

    }
    public int getCompletion(int totalQuestions, int currentQuestionNo ){
        int result = currentQuestionNo/totalQuestions*100;
        return result;
    }

    /**DISC TEST LOGIC END**/

    @Override
    public String toString() {
        return "DISC{" +
                "Dom=" + Dom +
                ", Inf=" + Inf +
                ", Sta=" + Sta +
                ", Com=" + Com +
                ", isUsed=" + isUsed +
                ", Complete=" + Complete +
                ", totalQuestions=" + totalQuestions +
                '}';
    }
}
