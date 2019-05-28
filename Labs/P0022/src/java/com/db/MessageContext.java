/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Chuc Nguyen
 */
public class MessageContext {
    public void writeMessage(Message message) throws Exception {
        String sql = "insert into [dbo].[Messages] ([Name], [Email], [Message])"
                + " values (?, ?, ?)";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, message.getName());
        ps.setString(2, message.getEmail());
        ps.setString(3, message.getMessage());
        
        System.out.println(ps.executeUpdate());
        ps.close();
        conn.close();
    }
}
