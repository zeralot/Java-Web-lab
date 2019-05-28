/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.Info;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Chuc Nguyen
 */
public class InfoContext {
    public Info getInfo() throws Exception {
        String sql = "select * from Info";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        if(rs.next()) {
            return new Info(rs.getString(1), rs.getString(2), rs.getString(3));
        }
        return null;
    }
}
