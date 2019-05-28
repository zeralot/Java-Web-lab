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
public class Plane {

    private int pid;
    private String name;
    private String number;
    private boolean statuss;

    public Plane(int pid, String name, String number, boolean statuss) {
        this.pid = pid;
        this.name = name;
        this.number = number;
        this.statuss = statuss;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public boolean isStatuss() {
        return statuss;
    }
    
}
