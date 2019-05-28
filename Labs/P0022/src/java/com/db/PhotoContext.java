/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.Photo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chuc Nguyen
 */
public class PhotoContext {
    public List<Photo> getPhotos() throws Exception {
        String sql = "select * from Photos";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        List<Photo> photoList = new ArrayList<Photo>();
        while(rs.next()) {
            photoList.add(new Photo(rs.getInt(1), rs.getString(2), 
                    rs.getString(3), rs.getString(4), rs.getString(5)));
        }
        return photoList;
    }
    
    public Photo getPhotoById(int id) throws Exception {
        String sql = "select * from Photos where ID="+id;
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        if(rs.next()) {
            return new Photo(rs.getInt(1), rs.getString(2), 
                    rs.getString(3), rs.getString(4), rs.getString(5));
        }
        return null;
    }
    
    public Photo getNextPhoto(int id) throws Exception {
        String sql = "select * from Photos where ID>"+id;
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        if(rs.next()) {
            return new Photo(rs.getInt(1), rs.getString(2), 
                    rs.getString(3), rs.getString(4), rs.getString(5));
        }
        return null;
    }
    
    public Photo getPrevPhoto(int id) throws Exception {
        String sql = "select * from Photos where ID<"+id+" order by ID desc";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        if(rs.next()) {
            return new Photo(rs.getInt(1), rs.getString(2), 
                    rs.getString(3), rs.getString(4), rs.getString(5));
        }
        return null;
    }
    
    public int getFirstIndex() throws Exception {
        String sql = "select * from Photos order by ID";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        if(rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }
    
    public int getLastIndex() throws Exception {
        String sql = "select * from Photos order by ID desc";
        Connection conn = new DBContext().getConnection();
        ResultSet rs = conn.prepareStatement(sql).executeQuery();
        if(rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }
}
