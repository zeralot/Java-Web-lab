/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Course;
import entity.Intro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhgqse04763
 */
public class IntroDAO {
    private Connection connection;

    public IntroDAO() {
    }
    
    public Intro getIntro() {
        Intro temp = null;
        try {
            DBContext dBContext = new DBContext();
            connection = dBContext.getConnection();
            
            String sql = "SELECT * FROM [Intro]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                temp = new Intro(rs.getString("title"), 
                        rs.getString("content"),
                        rs.getString("image"));
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return temp;
    }
}
