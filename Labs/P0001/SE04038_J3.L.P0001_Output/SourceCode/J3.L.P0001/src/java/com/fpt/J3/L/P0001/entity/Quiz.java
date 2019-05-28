/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0001.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Students
 */
public class Quiz implements Serializable{
    private int quizID; //identity
    private int userID;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String answerRight;
    private Date dateCreated;

    public Quiz() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAnswerRight() {
        return answerRight;
    }

    public void setAnswerRight(String answerRight) {
        this.answerRight = answerRight;
    }

    public Quiz(int quizID, int userID, String question, String answer1, String answer2, String answer3, String answer4, String answerRight, Date dateCreated) {
        this.quizID = quizID;
        this.userID = userID;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answerRight = answerRight;
        this.dateCreated = dateCreated;
    }

    public Quiz(int userID, String question, String answer1, String answer2, String answer3, String answer4, String answerRight) {
        this.userID = userID;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answerRight = answerRight;
    }

    public int getQuizID() {
        return quizID;
    }

    public void setQuizID(int quizID) {
        this.quizID = quizID;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quizID=" + quizID + ", userID=" + userID + ", question=" + question + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", answerRight=" + answerRight + ", dateCreated=" + dateCreated + '}';
    }

}
