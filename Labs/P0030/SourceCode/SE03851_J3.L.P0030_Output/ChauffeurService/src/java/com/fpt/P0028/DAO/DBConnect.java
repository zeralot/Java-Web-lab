package com.fpt.P0028.DAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import javax.servlet.ServletContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Students
 */
public class DBConnect {

    private Connection con;
    private boolean errors;
    private InputStream is = null;
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=";

    /**
     * function: Constructer Connect to SQL with file config.properties
     *
     * @param sc
     */
    public DBConnect(ServletContext sc) {
        try {

            is = null;
            is = sc.getResourceAsStream("./WEB-INF/config.properties");
            Properties pi = new Properties();
            pi.load(is);
            String databasename = pi.getProperty("databasename");
            String user = pi.getProperty("user");
            String pass = pi.getProperty("pass");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url + databasename, user, pass);
        } catch (IOException ex) {
            errors = true;
        } catch (ClassNotFoundException ex) {
            errors = true;
        } catch (SQLException ex) {
            errors = true;
        }

    }

    /**
     * check DB connect with SQL server
     *
     * @return true if connect and false if not connect
     */
    public boolean isConnect() {
        return con != null;
    }

    /**
     * function : select with order by
     *
     * @param table
     * @param orderby
     * @return row and colum in database
     */
    public ResultSet select(String table, String orderby) {
        ResultSet result;
        Statement state;
        try {

            String sql = "SELECT * FROM " + table + " ORDER BY " + orderby + " DESC";
            state = con.createStatement();
            result = state.executeQuery(sql);
        } catch (SQLException ex) {
            return null;
        }
        return result;
    }

    /**
     * function : select database without order by
     *
     * @param table
     * @return row and colum in database
     */
    public ResultSet selectTB(String table, String where) {
        ResultSet result;
        Statement state;
        try {

            String sql = "SELECT * from " + table + " where " + where;
            state = con.createStatement();
            result = state.executeQuery(sql);
        } catch (SQLException ex) {
            return null;
        }
        return result;
    }

    /**
     * function : Insert new Contact in database
     *
     * @param table
     * @param fied
     * @param add
     * @return true or false
     */
    public boolean addContact(String table, String fied, String add) {
        Statement state;
        try {

            String sql = "INSERT INTO " + table + "(" + fied + ") VALUES (" + add + ")";
            state = con.createStatement();
            state.execute(sql);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        return true;
    }

    /**
     * function: Close Connect to database
     */
    public void toClose() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
        }
    }

    /**
     * function Update data in to table
     *
     * @param table you want to update
     * @param update number you want to update
     * @return true or false
     */
    public boolean Update(String table, int update) {
        try {
            String sql = "Update " + table + " set views = " + update + " where page = 'index'";
            Statement state;
            state = con.createStatement();
            state.execute(sql);

        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
