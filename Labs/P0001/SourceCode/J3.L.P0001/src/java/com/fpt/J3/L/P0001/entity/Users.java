/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0001.entity;

/**
 *
 * @author Students
 */
public class Users {
    private int userID; // indentity
    private String userName;
    private String password;
    private int userType; //1 = teacher, 2 = normal
    private String email;
    private int testState = -1; //-2 is test done. -1 is not yet. Others(0, 1, 2, 3...) isnumber of question is  testing.
    public Users() {
    }

    public int getTestState() {
        return testState;
    }

    public void setTestState(int testState) {
        this.testState = testState;
    }
    
    public Users(String userName, String password, int userType, String email) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
