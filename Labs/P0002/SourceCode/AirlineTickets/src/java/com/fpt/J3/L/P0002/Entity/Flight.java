/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0002.Entity;

/**
 *
 * @author Students
 */
public class Flight {
    private int fid;
    private String placefrom;
    private String placeto;
    private String depart;
    private String arrive;
    private String detail;
    private String departtime;
    private String arrivetime;

    public Flight() {
    }

    public Flight(String placefrom, String placeto, String depart, String arrive, String detail, String departtime, String arrivetime) {
        
        this.placefrom = placefrom;
        this.placeto = placeto;
        this.depart = depart;
        this.arrive = arrive;
        this.detail = detail;
        this.departtime = departtime;
        this.arrivetime = arrivetime;
    }

    
    
}
