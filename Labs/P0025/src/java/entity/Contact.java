/*
 * TemplateSampleClass1.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2018 FPT University
 */

package entity;

/**
 * Getter & Setter
 * 
 * @author FPT University VinhPT SE02312
 * @version 1.0
 */

public class Contact {
    private String name;
    private String email;
    private String message;

    /**
     * Constructor
     */
    public Contact() {
    }

    /**
     * Constructor
     * @param name
     * @param email
     * @param message
     */
    public Contact(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    /**
     * Get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get email
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get message
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
