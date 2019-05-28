/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author anhgqse04763
 */

public class Course {
    private int id;
    private String title;
    private String content;
    private Date date;
    private String image;

    public Course() {
    }

    public Course(int id, String title, String content, Date date, String image) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", date=" + date + ", image=" + image + '}';
    }
    
}
