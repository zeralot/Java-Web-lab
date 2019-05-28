/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.db.DBContext;
import com.db.InfoContext;
import com.db.IntroContext;
import com.db.IntroImageContext;
import com.db.PhotoContext;
import com.entity.Info;
import com.entity.Intro;
import com.entity.IntroImage;
import com.entity.Photo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Chuc Nguyen
 */
public class PagesController {
    public List<Photo> getPhotos() throws Exception {
        return new PhotoContext().getPhotos();
    }
    
    public Intro getIntro(String type) throws Exception {
        return new IntroContext().getIntro(type);
    }
    public IntroImage getIntroImage() throws Exception {
        return new IntroImageContext().getIntroImage();
    }
    
    public Info getInfo() throws Exception {
        return new InfoContext().getInfo();
    }
}
