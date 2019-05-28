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
public class ListLocation {

    private ArrayList<Location> ListLocation;
    private DBConnect DB;
    private String table;

    public ListLocation(ServletContext sc) {
        DB = new DBConnect(sc);
        ListLocation = new ArrayList<>();
        table = "Location";
    }

    private void getAllListLocation() {
        try {
            ResultSet resultSet = DB.select(table, "lid");
            while (resultSet.next()) {
                int lid = resultSet.getInt("lid");
                String country = resultSet.getNString("country");
                String city = resultSet.getNString("city");
                String symbol = resultSet.getNString("symbol");
                boolean statuss = resultSet.getBoolean("statuss");
                ListLocation.add(new Location(lid, country, city, symbol, statuss));
            }
        } catch (SQLException ex) {
        }
    }
    public Location getOneLocation(int id) {
        try {
            ResultSet resultSet = DB.selectTB(table, " lid = " + id);
            while (resultSet.next()) {
                int lid = resultSet.getInt("lid");
                String country = resultSet.getNString("country");
                String city = resultSet.getNString("city");
                String symbol = resultSet.getNString("symbol");
                boolean statuss = resultSet.getBoolean("statuss");
                return new Location(lid, country, city, symbol, statuss);
            }
        } catch (SQLException ex) {
            return null;
        }
        return null;
    }
    public ArrayList<Location> getListLocation() {
        getAllListLocation();
        return ListLocation;
    }
    public void close(){
        DB.toClose();
    }
}
