/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.edu.vn.P0003.Model;

/**
 *
 * @author Students
 */
public class User {

    private int uid;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private boolean Status;
    private String email;

    public User(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public User(int uid, String username, String password, String firstname, String lastname, boolean Status, String email) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.Status = Status;
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public boolean isStatus() {
        return Status;
    }

    public String getEmail() {
        return email;
    }

}
