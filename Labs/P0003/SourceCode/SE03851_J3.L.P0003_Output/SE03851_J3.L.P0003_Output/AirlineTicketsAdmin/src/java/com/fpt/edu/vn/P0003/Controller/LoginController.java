/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.edu.vn.P0003.Controller;

import com.fpt.edu.vn.P0003.BAO.ListUser;
import com.fpt.edu.vn.P0003.BO.Validation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Students
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {
    
    ListUser listUser;
    HttpSession session;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String username = request.getParameter("UserName");
        String password = request.getParameter("Password");
        String RememberMe = request.getParameter("RememberMe");
        
        if (!Validation.checkEmp(username) && !Validation.checkEmp(password)) {
            //if isset ussername and password
            if (RememberMe == null) {
                // set session
                listUser = new ListUser(getServletContext());
                if (listUser.toLogin(username, password) != null) {
                    session = request.getSession();
                    session.setAttribute("UserName", username);
                    response.sendRedirect("./index.jsp");
                } else {
                    //not right user
                    session = request.getSession();
                    session.setAttribute("errrors", "Please check your username and password!");
                    response.sendRedirect("./login.jsp");
                }
                PrintWriter out = response.getWriter();
                out.print(username);
                
            } else {
                // set cookie
                listUser = new ListUser(getServletContext());
                if (listUser.toLogin(username, password) != null) {
                    Cookie cookie = new Cookie("user", username);
                    response.addCookie(cookie);
                    response.sendRedirect("./index.jsp");
                } else {
                    //not right user
                    session = request.getSession();
                    session.setAttribute("errrors", "Please check your username and password!");
                    response.sendRedirect("./login.jsp");
                }
            }
        }
        listUser.close();
        //processRequest(request, response);
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
