/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.P0030.BAO;

import com.fpt.P0028.DAO.DBConnect;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class ListContact {

    private DBConnect db;

    /**
     * function : constructer create new Object DB
     *
     * @param sc
     */
    public ListContact(ServletContext sc) {
        db = new DBConnect(sc);
    }

    /**
     * function : add new Contact in database
     *
     * @param name
     * @param email
     * @param mess
     * @return true or false
     */
    public boolean addContact(String name, String email, String mess) {
        return db.addContact("Contacts", "name, email, mess", "'" + name + "','" + email + "', '" + mess + "'");
    }
    public void close(){
        db.toClose();
    }

}
