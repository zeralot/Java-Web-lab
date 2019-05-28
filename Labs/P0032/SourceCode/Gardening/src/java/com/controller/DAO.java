/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
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
public class DAO {
      public Connection conn;
    private Statement stat;
    private PreparedStatement preS;
    private ResultSet rs;

    public DAO() {
    }

    public void connect(ServletContext sc) throws IOException {
        try {
            Properties p = new Properties();
            InputStream in = sc.getResourceAsStream("WEB-INF\\config.properties");
            p.load(in);
            String user = p.getProperty("user");
            String pass = p.getProperty("pass");

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=garden";
            conn = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int up(int z) {
        int k = 0;
        try {
            String sql = "update db set soluot = ?";
            preS = conn.prepareStatement(sql);
            preS.setInt(1, z);
            k = preS.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public ResultSet get(String sql) {
        try {
            stat = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stat.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
