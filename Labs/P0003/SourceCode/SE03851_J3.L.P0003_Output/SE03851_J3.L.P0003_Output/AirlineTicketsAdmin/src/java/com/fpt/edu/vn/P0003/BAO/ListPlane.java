/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.edu.vn.P0003.BAO;

import com.fpt.edu.vn.P0003.DAO.DBConnect;
import com.fpt.edu.vn.P0003.Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class ListPlane {

    private ArrayList<Plane> ListPlane;
    private DBConnect DB;
    private String table;

    public ListPlane(ServletContext sc) {
        DB = new DBConnect(sc);
        ListPlane = new ArrayList<>();
        table = "Plane";
    }

    private void getAllPlane() {
        try {
            ResultSet resultSet = DB.select(table, " pid");
            while (resultSet.next()) {
                int pid = resultSet.getInt("pid");
                String name = resultSet.getNString("name");
                String number = resultSet.getNString("number");
                boolean statuss = resultSet.getBoolean("statuss");
                ListPlane.add(new Plane(pid, name, number, statuss));
            }
        } catch (SQLException ex) {
        }
    }

    public ArrayList<Plane> getListPlane() {
        getAllPlane();
        return ListPlane;
    }
    
    public void close(){
        DB.toClose();
    }
    

}
