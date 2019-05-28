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
public class Flights {

    private int fid;
    private String oren;
    private String des;
    private String date;
    private String time;
    private String times_end;
    private double price;
    private int slot;
    private int pid;
    private boolean status;

    public Flights(int fid, String oren, String des, String date, String time, String times_end, double price, int slot, int pid, boolean status) {
        this.fid = fid;
        this.oren = oren;
        this.des = des;
        this.date = date;
        this.time = time;
        this.times_end = times_end;
        this.price = price;
        this.slot = slot;
        this.pid = pid;
        this.status = status;
    }

    

    public int getFid() {
        return fid;
    }

    public String getOren() {
        return oren;
    }

    public String getDes() {
        return des;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public String getTimes_end() {
        return times_end;
    }
    
    
    public int getSlot() {
        return slot;
    }

    public int getPid() {
        return pid;
    }

    public boolean isStatus() {
        return status;
    }
    
}
