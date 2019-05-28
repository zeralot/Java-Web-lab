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
public class Location {

    private int lid;
    private String country;
    private String city;
    private String symbol;
    private boolean statuss;

    public Location(int lid, String country, String city, String symbol, boolean statuss) {
        this.lid = lid;
        this.country = country;
        this.city = city;
        this.symbol = symbol;
        this.statuss = statuss;
    }

    public int getLid() {
        return lid;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isStatuss() {
        return statuss;
    }

}
