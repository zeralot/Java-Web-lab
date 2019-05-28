/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ContactInfo;
import entity.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author anhgqse04763
 */
public class ContactInfoDAO {
    private Connection connection;

    public ContactInfoDAO() {
    }
    
    // Get contact info
    public ContactInfo getContactInfo() {
        ContactInfo temp = null;
        try {
            DBContext dBContext = new DBContext();
            connection = dBContext.getConnection();
            
            String sql = "SELECT * FROM [ContactInfo]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                temp = new ContactInfo(rs.getString("address"), 
                        rs.getString("city"), 
                        rs.getString("country"),
                        rs.getString("tel"),
                        rs.getString("email"));
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
