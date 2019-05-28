/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.L231.controller;

import com.fpt.lab231.BO.User;

import java.sql.Statement;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class DAO_User {

    private Connection conn;
    private Statement stat;
    private PreparedStatement preS;
    private ResultSet rs;

    public DAO_User() {
    }

    public int addUser(User user) {
        int u = 0;
        try {
            String sql = "insert into user1 values(?,?,?,?,?,?,?,?)";
            preS = conn.prepareStatement(sql);
            preS.setString(1, user.getUserName());
            preS.setString(2, user.getEmail());
            preS.setString(3, user.getFirstName());
            preS.setString(4, user.getLastName());
            preS.setString(5, user.getWebsite());
            preS.setString(6, user.getPassword());
            preS.setString(7, user.getRole());
            preS.setInt(8, 6);
            u = preS.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    public void connect(ServletContext sc) throws IOException {
        try {
            Properties p = new Properties();
            InputStream in = sc.getResourceAsStream("WEB-INF\\config.properties");
            p.load(in);
            String user = p.getProperty("user");
            String pass = p.getProperty("pass");

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=userproject";
            conn = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet search(String name) {
        return get("select * from user1 where UserName = '" + name + "'");
    }

    public ResultSet getUser() {
        return get("select * from user1");
    }

    public ResultSet getSu() {
        return get("select * from user1 where Role = 'Subscriber'");
    }

    public ResultSet getAd() {
        return get("select * from user1 where Role = 'Administrator'");
    }

    public ResultSet getCount() {
        return get("select COUNT(*) from user1");
    }

    public ResultSet getCount1() {
        return get("select COUNT(*) from user1 where Role='Subscriber'");
    }

    public ResultSet getCount2() {
        return get("select COUNT(*) from user1 where Role='Administrator'");
    }

    public ResultSet get(String sql) {
        try {
            stat = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void closeDB() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
