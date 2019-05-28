/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.db.MessageContext;
import com.db.PhotoContext;
import com.entity.Message;
import com.entity.Photo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Chuc Nguyen
 */
public class ServletController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String buildSimpleJson(HashMap<String, String> jsonData) {
        if(jsonData.size()==0) return "";
        String json = "{";
        for(String keys: jsonData.keySet()) {
            json+="\""+keys+"\":";
            json+="\""+jsonData.get(keys)+"\",";
        }
        json=json.substring(0,json.length()-1);
        json+="}";
        System.out.println(json);
        return json;
    }
    
    private void loadImage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
        String idString = request.getParameter("id");
        if(idString!=null) {
            try {
                PhotoContext pc = new PhotoContext();
                Photo photo=pc.getPhotoById(Integer.parseInt(idString));
                
                HashMap<String, String> jsonData=new HashMap<>();
                jsonData.put("imageUrl", photo.getImageUrl());
                jsonData.put("firstIndex", pc.getFirstIndex()+"");
                jsonData.put("lastIndex", pc.getLastIndex()+"");
                jsonData.put("currentID", photo.getId()+"");
                buildSimpleJson(jsonData);
                
                out.print(buildSimpleJson(jsonData));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }
    
    private void loadNextImage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
        String idString = request.getParameter("id");
        if(idString!=null) {
            try {
                PhotoContext pc = new PhotoContext();
                Photo photo=pc.getNextPhoto(Integer.parseInt(idString));
                
                HashMap<String, String> jsonData=new HashMap<>();
                jsonData.put("imageUrl", photo.getImageUrl());
                jsonData.put("firstIndex", pc.getFirstIndex()+"");
                jsonData.put("lastIndex", pc.getLastIndex()+"");
                jsonData.put("currentID", photo.getId()+"");
                buildSimpleJson(jsonData);
                
                out.print(buildSimpleJson(jsonData));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }
    
    private void loadPrevImage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
        String idString = request.getParameter("id");
        if(idString!=null) {
            try {
                PhotoContext pc = new PhotoContext();
                Photo photo=pc.getPrevPhoto(Integer.parseInt(idString));
                
                HashMap<String, String> jsonData=new HashMap<>();
                jsonData.put("imageUrl", photo.getImageUrl());
                jsonData.put("firstIndex", pc.getFirstIndex()+"");
                jsonData.put("lastIndex", pc.getLastIndex()+"");
                jsonData.put("currentID", photo.getId()+"");
                buildSimpleJson(jsonData);
                
                out.print(buildSimpleJson(jsonData));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }
    
    private void writeMessage(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        try {
            new MessageContext().writeMessage(new Message(0, request.getParameter("name"), 
                request.getParameter("email"), request.getParameter("message")));
        } catch (Exception e) {
            e.printStackTrace();
            session.setAttribute("message", "Error occured. Cannot send message");
            response.sendRedirect("index.jsp");
            return;
        }
        
        session.setAttribute("message", "Your message has been sent successfully");
        response.sendRedirect("index.jsp");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action!=null) {
            if("loadImage".equals(action)) {
                loadImage(request, response);
            } else if("loadNextImage".equals(action)) {
                loadNextImage(request, response);
            } else if("loadPrevImage".equals(action)) {
                loadPrevImage(request, response);
            } else if("writeMessage".equals(action)) {
                writeMessage(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
