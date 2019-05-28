/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3LP0004.entity;

import java.util.Date;

/**
 *
 * @author Students
 */
public class News {
    private int newsID;
    private String title;
    private String content;
    private String author;
    private Date date;
    private String img;

    public News() {
    }

    public News(int newsID, String title, String content, String author, Date date, String img) {
        this.newsID = newsID;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.img = img;
    }
    
    public News(String title, String content, String author, Date date, String img) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
        this.img = img;
    }

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    } 
}
