/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0002.Model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.sql.*;
import javax.servlet.ServletContext;

/**
 *
 * @author Students
 */
public final class DBConnect {
    Connection conn = null;
    Statement state = null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    
    //connect to database
    public DBConnect(String url, String user, String pass){
        Connection4(url,user,pass);
    }
    
    //connect to database using information from properties file
    public DBConnect(ServletContext sc) throws IOException{
        InputStream is = sc.getResourceAsStream("WEB-INF\\config.properties");
        Properties pi = new Properties();
        pi.load(is);
        Connection4("jdbc:sqlserver://localhost:1433;databaseName="+pi.getProperty("databasename"),pi.getProperty("user"),pi.getProperty("pass"));
    }
    
    public void Connection4(String url, String user, String pass){
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e){
        }
    }
    
    //get data from dataabsae
    public ResultSet getData(String sql){
        ResultSet rs = null;
        try{
            state = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);
        }
        catch(Exception e){
        }
        return rs;
    }
    public void close() throws SQLException{
        conn.close();
    }
    
    public Connection getConnect(){
        return conn;
    }
    public static void main(String[] args) {
    }
 
}
