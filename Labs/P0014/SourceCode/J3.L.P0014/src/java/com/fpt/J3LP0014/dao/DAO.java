/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3LP0014.dao;

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
    Connection conn = null;
    Statement state = null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    
    public DAO() {
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
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=J3LP0014", username, password);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getData(String sql) {
        try {
            state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void updateData(int count) {
        try {
            state = conn.createStatement();
            state.executeUpdate("update Visit set countVisit=" + count);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet setBanner() {
        return getData("select * from PhotoBanner");
    }
    
    public ResultSet setIntro() {
        return getData("select top 1 * from Intro");
    }
    
    public ResultSet setVisit() {
        return getData("select * from Visit");
    }
    
    public ResultSet setDiary() {
        return getData("select * from Diary order by diaryID desc");
    }
    
    public ResultSet setPhotoAlbum() {
        return getData("select top 8 * from Picture order by pictureID");
    }
    
    public ResultSet setTrekkingLinks() {
        return getData("select * from TrekkingLinks");
    }
}
