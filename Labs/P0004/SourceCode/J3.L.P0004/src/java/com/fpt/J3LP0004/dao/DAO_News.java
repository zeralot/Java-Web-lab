/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3LP0004.dao;

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
public class DAO_News {

    Connection conn = null;
    Statement state = null;
    PreparedStatement pre = null;
    ResultSet rs = null;

    public DAO_News() {
    }

    public void connection4(ServletContext sc) throws IOException {
        try {
            //get driver
            Properties p = new Properties();
            InputStream f = sc.getResourceAsStream("WEB-INF\\config.properties");
            p.load(f);
            String username = p.getProperty("username");
            String password = p.getProperty("password");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=J3LP0004", username, password);
        } catch (SQLException ex) {
            Logger.getLogger(DAO_News.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_News.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getData(String sql) {
        try {
            state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);   

        } catch (SQLException ex) {
            Logger.getLogger(DAO_News.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static void main(String[] args) {
    }
}
