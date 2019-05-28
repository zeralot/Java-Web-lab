/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Contact;
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
public class ContactDAO {
    private Connection connection;

    public ContactDAO() {
    }
    
    // Insert contact
    public void insertContact(Contact contact) {
        try {
            DBContext dBContext = new DBContext();
            connection = dBContext.getConnection();
            
            String sql = "INSERT INTO Contact VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, contact.getName());
            statement.setString(2, contact.getEmail());
            statement.setString(3, contact.getMessage());
            
            statement.executeQuery();
            
        } catch (Exception ex) {
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
