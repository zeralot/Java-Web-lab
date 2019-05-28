/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.P0049.DAO;

import java.util.Calendar;
import java.util.HashMap;

/**
 *
 * @author Students
 */
public class control {

    private int month;
    private int year;
    private int days[][];
    private int numOfWeek;
    private static HashMap months = new HashMap();

    private control() {
    }

    private control(int month, int year) {
        days = new int[6][7];
        numOfWeek = 0;
        this.month = month;
        this.year = year;
        buildWeek();

    }

    public int getMonth() {
        return month;
    }

    public static control getMonth(int month, int year) {
        String key = String.valueOf((new StringBuffer(String.valueOf(month))).append("/").append(year));
        if (months.containsKey(key)) {
            return (control) months.get(key);
        } else {
            control newMonth = new control(month, year);
            months.put(key, newMonth);
            return newMonth;
        }
    }

    private void buildWeek() {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(1);
        c.set(year, month, 1);
        for (; c.get(Calendar.MONTH) == month; c.add(Calendar.DATE, 1)) {
            int weekNum = c.get(Calendar.WEEK_OF_MONTH) - 1;
            int dayOfWeek = calculateDay(c.get(Calendar.DAY_OF_WEEK));
            days[weekNum][dayOfWeek] = c.get(Calendar.DATE);
            numOfWeek = weekNum;
        }
    }

    public int calculateDay(int day) {
        if (day == 1) {
            return 0;
        }
        if (day == 2) {
            return 1;
        }
        if (day == 3) {
            return 2;
        }
        if (day == 4) {
            return 3;
        }
        if (day == 5) {
            return 4;
        }
        if (day == 6) {
            return 5;
        }
        return day != 7 ? 7 : 6 ;
    }
    public int[][] getDays(){ return days;}
    public int getNumOfWeek(){ return numOfWeek + 1;}
    public int getYear(){ return year;}
}
