/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0001.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Students
 */
public class Result {
    private int resultID; //identity(1,)
    private int userID;
    private Date dateCompleted;
    private ArrayList<Quiz> listTakeQuiz;
    private double score;

    public Result() {
    }

    public Result(int userID, ArrayList<Quiz> listTakeQuiz, double score) {
        this.userID = userID;
        this.listTakeQuiz = listTakeQuiz;
        this.score = score;
    }

    public int getResultID() {
        return resultID;
    }

    public void setResultID(int resultID) {
        this.resultID = resultID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public ArrayList<Quiz> getListTakeQuiz() {
        return listTakeQuiz;
    }

    public void setListTakeQuiz(ArrayList<Quiz> listTakeQuiz) {
        this.listTakeQuiz = listTakeQuiz;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}
