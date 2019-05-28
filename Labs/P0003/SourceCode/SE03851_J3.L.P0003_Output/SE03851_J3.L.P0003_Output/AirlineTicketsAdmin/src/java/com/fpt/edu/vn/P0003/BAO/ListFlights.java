/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.edu.vn.P0003.BAO;

import com.fpt.edu.vn.P0003.DAO.DBConnect;
import com.fpt.edu.vn.P0003.Model.*;
import com.sun.org.apache.bcel.internal.generic.F2D;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class ListFlights {

    private ArrayList<Flights> flightses;
    private DBConnect DB;
    private String table;
    private ListLocation listLocation;

    public ListFlights(ServletContext sc) {
        DB = new DBConnect(sc);
        flightses = new ArrayList<>();
        table = "Flights";
        listLocation = new ListLocation(sc);
    }

    private void getAllListFlights() {
        try {
            ResultSet resultSet = DB.select(table, "fid");
            while (resultSet.next()) {
                int fid = resultSet.getInt("fid");
                String date = resultSet.getNString("dates");
                String time = resultSet.getNString("times");
                String times_end = resultSet.getNString("times_end");
                double price = resultSet.getDouble("price");
                int oren_data = resultSet.getInt("oid");
                int des_data = resultSet.getInt("did");
                int slot = resultSet.getInt("slot");
                int pid = resultSet.getInt("pid");
                boolean statuss = resultSet.getBoolean("statuss");
                Location Origin = listLocation.getOneLocation(oren_data);
                Location Destination = listLocation.getOneLocation(des_data);
                if (Origin != null && Destination != null) {
                    String oren = Origin.getCity();
                    String des = Destination.getCity();
                    flightses.add(new Flights(fid, oren, des, date, time, times_end, price, slot, pid, statuss));
                }

            }
        } catch (SQLException ex) {
        }
    }

    public ArrayList<Flights> getFlightses() {
        getAllListFlights();
        return flightses;
    }

    public boolean addnewFlights(int oid, int did, String dates, String times, double price, int slot, int pid, boolean statuss, String times_end) {
        int status = 1;
        if(!statuss){
            status = 0;
        }
        String addnew = oid + "," + did + "," + "'" + dates + "'," + "'" + times + "'," + price + "," + slot + "," + pid +","+ status+ ",'" + times_end + "'";
        return DB.addContact(table, "oid,did,dates,times,price,slot,pid,statuss,times_end",addnew);
    }
    public void close(){
        DB.toClose();
    }
}
