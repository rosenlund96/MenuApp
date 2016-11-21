package com.grp12.softskilltools.Entities;

import com.grp12.softskilltools.resources.BELBIN_Data;


/**
 * Created by mathiaslarsen on 18/11/2016.
 */

public class BELBIN extends AbstractItem {
    private String name;
    private final int totalQuestions = 70;
    public static Question[] questions;

    public BELBIN(double cost, boolean isUsed, String name) {
        super(cost, isUsed);
        this.name = name;
        initialize();
    }


    public void initialize(){
        questions = new Question[totalQuestions];
        for (int i = 0; i < totalQuestions; i++){
            questions[i] = new Question(BELBIN_Data.BelbinWord_Data[i],BELBIN_Data.QuestionNo_DATA[i],BELBIN_Data.BELBINTYPE_Data[i]);
        }
    }
    @Override
    public String toString() {
        return "BELBIN{}";
    }
}
