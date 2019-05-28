/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0001.model;

import com.fpt.J3.L.P0001.entity.Quiz;
import com.fpt.J3.L.P0001.entity.Result;
import com.fpt.J3.L.P0001.entity.Users;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
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

    private Connection con = null;
    private Statement state = null;
    PreparedStatement pre = null;

    public DAO() {
    }

    public DAO(ServletContext sc) {
        try {
            InputStream is = sc.getResourceAsStream("WEB-INF\\config.properties");
            Properties p = new Properties();
            p.load(is);
            String driver = p.getProperty("driver");
            String url = p.getProperty("url");
            String user = p.getProperty("user");
            String pass = p.getProperty("pass");
            connection(driver, url, user, pass);
        } catch (IOException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void connection(String driver, String url, String user, String pass) {
        try {
            //get driver
            Class.forName(driver);
            //get connect
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            state = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void addResult(Result r) {
        String sql = "insert into Result(userID, quizNumber, score) values(?, ?, ?)";
        try {
            pre = con.prepareStatement(sql);
            pre.setInt(1, r.getUserID());
            pre.setInt(2, r.getListTakeQuiz().size());
            pre.setFloat(3, (float) r.getScore());
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addUser(Users u) {
        String sql = "insert into Users(userName, password, userType, email) values(?, ?, ?, ?)";
        try {
            pre = con.prepareStatement(sql);
            pre.setString(1, u.getUserName());
            pre.setString(2, u.getPassword());
            pre.setInt(3, u.getUserType());
            pre.setString(4, u.getEmail());
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addQuiz(Quiz q) {
        String sql = "insert into Quiz(userID, question, answer1, answer2, answer3, answer4, answerRight) values(?, ?, ?, ?, ?, ?, ?)";
        try {
            System.out.println(q);
            pre = con.prepareStatement(sql);
            pre.setInt(1, q.getUserID());
            pre.setString(2, q.getQuestion());
            pre.setString(3, q.getAnswer1());
            pre.setString(4, q.getAnswer2());
            pre.setString(5, q.getAnswer3());
            pre.setString(6, q.getAnswer4());
            pre.setString(7, q.getAnswerRight());
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
