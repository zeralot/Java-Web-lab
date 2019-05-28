/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.edu.vn.P0003.BAO;

import com.fpt.edu.vn.P0003.DAO.DBConnect;
import com.fpt.edu.vn.P0003.Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class ListUser {

    private ArrayList<User> ListUser;
    private DBConnect DB;
    private String table;

    public ListUser(ServletContext sc) {
        DB = new DBConnect(sc);
        ListUser = new ArrayList<>();
        table = "Users";
    }

    public User toLogin(String username, String password) {
        try {
            ResultSet resultSet = DB.selectTB(table, "username = '" + username + "'AND password = '" + password + "'");
            String username_re = "";
            String password_re = "";
            int id = 0;
            while (resultSet.next()) {
                id = resultSet.getInt("uid");
                if (id == 1) {
                    username_re = resultSet.getNString("username");
                    password_re = resultSet.getNString("password");
                }
            }
            return new User(id, username_re, password_re);
        } catch (SQLException ex) {
            return null;
        }
    }

    private void getAllListUser() {
        try {
            ResultSet resultSet = DB.select(table, "uid");

            while (resultSet.next()) {
                int id = resultSet.getInt("uid");
                String username = resultSet.getNString("username");
                String password = resultSet.getNString("password");
                String firstname = resultSet.getNString("firstname");
                String lastname = resultSet.getNString("lastname");
                boolean status = resultSet.getBoolean("status");
                String email = resultSet.getNString("email");
                ListUser.add(new User(id, username, password, firstname, lastname, status, email));
            }
        } catch (SQLException ex) {
        }
    }

    public ArrayList<User> getListUser() {
        getAllListUser();
        return ListUser;
    }
    
    public User getOneUser(int id){
        try {
            ResultSet resultSet = DB.selectTB(table, "uid = "+id);
            while (resultSet.next()) {
                int uid = resultSet.getInt("uid");
                String username = resultSet.getNString("username");
                String password = resultSet.getNString("password");
                String firstname = resultSet.getNString("firstname");
                String lastname = resultSet.getNString("lastname");
                boolean status = resultSet.getBoolean("status");
                String email = resultSet.getNString("email");
                return new User(uid, username, password, firstname, lastname, status, email);
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    public void close(){
        DB.toClose();
    }
}
