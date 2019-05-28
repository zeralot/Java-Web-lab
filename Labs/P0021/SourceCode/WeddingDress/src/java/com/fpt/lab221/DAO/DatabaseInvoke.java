/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.lab221.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public class DatabaseInvoke {

    Connection conn = null;
    PreparedStatement pre = null;
    Statement st = null;

    public void connectToDatabase(ServletContext sc) {
        String user = null;
        String password = null;
        try {
            InputStream fi = sc.getResourceAsStream("WEB-INF\\config.properties");
            Properties pi = new Properties();
            pi.load(fi);
            user = pi.getProperty("user");
            password = pi.getProperty("password");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        }
        String url = "jdbc:sqlserver://localhost:1433;databaseName=WeddingDress;user=" + user + ";password=" + password;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertToGuestBook(String name, String email, String website, String imgLink, String content) {
        String sql = "insert into Guestbook(name,email,website,imgLink,content) values(?,?,?,?,?)";
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, email);
            pre.setString(3, website);
            pre.setString(4, imgLink);
            pre.setString(5, content);
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void updateView(int n) {
        String sql = "update TrackViewer set countViewer = ? where countViewer = ?";
        try {
            pre = conn.prepareStatement(sql);
            pre.setInt(1, n + 1);
            pre.setInt(2, n);
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseInvoke.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
