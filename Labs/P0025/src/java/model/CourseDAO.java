/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anhgqse04763
 */

public class CourseDAO {
    private Connection connection;

    public CourseDAO() {
    }
    
    // Get article by ID
    public Course getCourseById(int id) {
        Course temp = null;
        try {
            DBContext dBContext = new DBContext();
            connection = dBContext.getConnection();
            
            String sql = "SELECT * FROM [Course] WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                temp = new Course(rs.getInt("id"), 
                        rs.getString("title"), 
                        rs.getString("content"),
                        rs.getDate("date"),
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
    
    // Get all courses
    public ArrayList<Course> getAllCourses() {
        ArrayList<Course> temp = new ArrayList<>();
        try {
            DBContext dBContext = new DBContext();
            connection = dBContext.getConnection();
            
            String sql = "SELECT * " +
                "FROM [Course] " +
                "ORDER BY date DESC";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                temp.add(new Course(rs.getInt("id"), 
                        rs.getString("title"), 
                        rs.getString("content"),
                        rs.getDate("date"),
                        rs.getString("image")));
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
