/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.P0028.MODEL;

/**
 *
 * @author Students
 */
public class Contact {

    private int cid;
    private String name;
    private String email;
    private String mess;

    public Contact(int cid, String name, String email, String mess) {
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.mess = mess;
    }

    public Contact() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

}
