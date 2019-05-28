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
public class Booking {

    private int bid;
    private int fid;
    private String username;
    private boolean statuss;
    private String date;
    private String phone;
    private int seat;
    private String Bookingnumber;
    private String status_ticket;

    public Booking(int bid, int fid, String username, boolean statuss, String date, String phone, int seat, String Bookingnumber, String status_ticket) {
        this.bid = bid;
        this.fid = fid;
        this.username = username;
        this.statuss = statuss;
        this.date = date;
        this.phone = phone;
        this.seat = seat;
        this.Bookingnumber = Bookingnumber;
        this.status_ticket = status_ticket;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public int getSeat() {
        return seat;
    }

    public String getBookingnumber() {
        return Bookingnumber;
    }

    public String getStatus_ticket() {
        return status_ticket;
    }

    

    public int getBid() {
        return bid;
    }

    public int getFid() {
        return fid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isStatuss() {
        return statuss;
    }

}
