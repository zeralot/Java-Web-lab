/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.P0030.BAO;

import com.fpt.P0028.DAO.DBConnect;
import com.fpt.P0028.MODEL.Entry;
import java.util.*;
import java.sql.*;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class ListEntry {

    private ArrayList<Entry> listEntry;
    private DBConnect db;
    private String errors = "";

    /**
     * function contructer create new Object Db and List<Entry>
     *
     * @param sc
     */
    public ListEntry(ServletContext sc) {
        listEntry = new ArrayList<>();
        db = new DBConnect(sc);
        if (db.isConnect()) {
            errors = "Cannot connect to database";
        }

    }

    /**
     * function get all Entry in ResultSet and add in List Entry
     *
     * @param re ResultSet in database
     */
    public void ListEntrygetArr(ResultSet re) {
        try {
            while (re.next()) {
                int eid = re.getInt("eid");
                String name = re.getNString("name");
                String icon = re.getNString("icon");
                String description_pic = re.getNString("description_pic");
                int views_e = re.getInt("views_e");
                String description_entry = re.getNString("description_entry");
                String date = re.getDate("date").toString();
                int likes_e = re.getInt("likes_e");
                listEntry.add(new Entry(eid, name, icon, description_pic, views_e, description_entry, date, likes_e));
            }
        } catch (SQLException ex) {
            errors = "Cannot connect to database";
        }
    }

    /**
     * function Get List<Entry>
     *
     * @return
     */
    public ArrayList<Entry> getListEntry() {
        ResultSet re = db.select("Entrys", "date");
        ListEntrygetArr(re);
        return listEntry;
    }

    /**
     * function get var Errors and show in
     *
     * @return
     */
    public String getErrors() {
        return errors;
    }

    /**
     * function get one entry by id and load in view
     *
     * @param id
     * @return Entry
     */
    public Entry getEntry(String id) {
        try {
            Entry returEntry = null;
            Integer.parseInt(id);
            ResultSet re = db.selectTB("Entrys", "eid = " + id);
            while (re.next()) {
                int eid = re.getInt("eid");
                String name = re.getNString("name");
                String icon = re.getNString("icon");
                String description_pic = re.getNString("description_pic");
                int views_e = re.getInt("views_e");
                String description_entry = re.getNString("description_entry");
                String date = re.getDate("date").toString();
                int likes_e = re.getInt("likes_e");
                returEntry = new Entry(eid, name, icon, description_pic, views_e, description_entry, date, likes_e);
            }
            return returEntry;
        } catch (Exception e) {
            return null;
        }
    }
    public void close(){
        db.toClose();
    }
}
