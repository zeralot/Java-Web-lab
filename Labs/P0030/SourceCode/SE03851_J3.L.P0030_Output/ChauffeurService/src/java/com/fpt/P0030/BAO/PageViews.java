/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.P0030.BAO;

import com.fpt.P0028.DAO.DBConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class PageViews {

    private DBConnect db;

    public PageViews(ServletContext sc) {
        db = new DBConnect(sc);
    }

    /**
     * function Update number View Page in table
     */
    public void upViews() {
        try {
            ResultSet re = db.selectTB("views", "page = 'index'");
            int views = 0;
            while (re.next()) {
                views = re.getInt("views");
            }
            views++;
            db.Update("views", views);
        } catch (SQLException ex) {
        }
    }

    /**
     * get number of view in database for view
     *
     * @return
     */
    public String getViews() {
        try {
            ResultSet re = db.selectTB("views", "page = 'index'");
            int views = 0;
            while (re.next()) {
                views = re.getInt("views");
            }
            return views + "";
        } catch (SQLException ex) {
            return 0 + "";
        }
    }
    public void close(){
        db.toClose();
    } 
}
