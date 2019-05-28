/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0002.Entity;

/**
 *
 * @author Students
 */
public class Customer {
    private int cid;
     private String email;
    private  String password;
     private String firstname;
     private String lastname;
     private String address;
    private  String phonenumber;
    int sex;
    int age;
    String cardnumber;

    public Customer(int cid, String email, String password, String firstname, String lastname, String address, String phonenumber, int sex, int age, String cardnumber) {
        this.cid = cid;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.sex = sex;
        this.age = age;
        this.cardnumber = cardnumber;
    }

    public int getSex() {
        return sex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public int getCid() {
        return cid;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Customer() {
    }
}
