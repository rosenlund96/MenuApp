package com.grp12.softskilltools.Entities;

/**
 * Created by mathiaslarsen on 21/11/2016.
 */

public class Question {

    private String question;
    private int remainingQuestions;
    private int questionNo;
    private int totalQuestions;
    public boolean answered;
    public enum questionType {Dom,Inf,Sta,Com};
    public questionType type;

    public Question(String question,int totalQuestions,int questionNo){
        this.questionNo = questionNo;
        this.question = question;
        this.totalQuestions = totalQuestions;
    }

    public int getQuestionNo(){
        return questionNo;
    }
    public void setQuestionNo(int No) {this.questionNo = No;}
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String question) {this.question=question;}
    public void setAnswered(boolean answer){
        this.answered=answer;
    }
    public boolean getAnswered(){
        return answered;
    }
    public void setType(questionType type) {this.type = type;}
    public questionType getType() {return type;}

}
