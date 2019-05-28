/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.lab221.DAO;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.InternetHeaders;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Students
 */
public class CheckInput {

    public boolean checkName(String s) {
        if (s.isEmpty() || s == null) {
            return false;
        }
        return true;
    }

    public boolean checkEmail(String s) {
        if (s.isEmpty() || s == null) {
            return false;
        }
        return true;
    }
}
