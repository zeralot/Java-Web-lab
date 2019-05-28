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
public class Entry {

    private int eid;
    private String name;
    private String icon;
    private String description_pic;
    private int views_e;
    private String description_entry;
    private String date;
    private int likes_e;

    public Entry(int eid, String name, String icon, String description_pic, int views_e, String description_entry, String date, int likes_e) {
        this.eid = eid;
        this.name = name;
        this.icon = icon;
        this.description_pic = description_pic;
        this.views_e = views_e;
        this.description_entry = description_entry;
        this.date = date;
        this.likes_e = likes_e;
    }

    public int getLikes_e() {
        return likes_e;
    }

    public void setLikes_e(int likes_e) {
        this.likes_e = likes_e;
    }

    public Entry() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription_pic() {
        return description_pic;
    }

    public void setDescription_pic(String description_pic) {
        this.description_pic = description_pic;
    }

    public int getViews_e() {
        return views_e;
    }

    public void setViews_e(int views_e) {
        this.views_e = views_e;
    }

    public String getDescription_entry() {
        return description_entry;
    }

    public void setDescription_entry(String description_entry) {
        this.description_entry = description_entry;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
