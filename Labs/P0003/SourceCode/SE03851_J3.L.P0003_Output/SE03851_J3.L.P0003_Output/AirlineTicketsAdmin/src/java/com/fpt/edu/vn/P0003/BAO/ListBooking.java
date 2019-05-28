/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.edu.vn.P0003.BAO;

import com.fpt.edu.vn.P0003.DAO.DBConnect;
import com.fpt.edu.vn.P0003.Model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class ListBooking {

    private ArrayList<Booking> bookings;
    private DBConnect DB;
    private String table;
    private ListUser listUser ; 

    public ListBooking(ServletContext sc) {
        DB = new DBConnect(sc);
        bookings = new ArrayList<>();
        table = "Booking";
        listUser = new ListUser(sc);
    }

    private void getAllListBooking() {
        try {
            ResultSet resultSet = DB.select(table, "bid");
            while (resultSet.next()) {
                int bid = resultSet.getInt("bid");
                int fid = resultSet.getInt("fid");;
                int uid = resultSet.getInt("uid");
                boolean statuss = resultSet.getBoolean("statuss");
                String date = resultSet.getNString("date");
                String phone = resultSet.getNString("phone");
                int seat = resultSet.getInt("bid");
                String Bookingnumber = resultSet.getNString("Bookingnumber");
                String status_ticket = resultSet.getNString("status_ticket");
                User user = listUser.getOneUser(uid);
                bookings.add(new Booking(bid, fid, user.getUsername(), statuss, date, phone, seat, Bookingnumber, status_ticket));
            }
        } catch (SQLException ex) {
        }
    }

    public ArrayList<Booking> getBookings() {
        getAllListBooking();
        return bookings;
    }
    
    public void close(){
        DB.toClose();
    }
    
}
