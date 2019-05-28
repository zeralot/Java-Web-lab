/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0002.Controller;

import com.fpt.J3.L.P0002.Entity.Customer;
import com.fpt.J3.L.P0002.Model.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Students
 */
@WebServlet(name = "CustomerController", urlPatterns = {"/CustomerController"})
public class CustomerController extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        DBConnect dao = null;
        try {
            dao = new DBConnect(getServletContext());
            String service = request.getParameter(("service"));
            HttpSession session = request.getSession();
            if (service.equals("logout")) {
                session.invalidate();
                response.sendRedirect("index.jsp");
            } else if (service.equals("register")) {
                boolean check = true;
                String email = request.getParameter("email");
                String pass = request.getParameter("pass");
                String repass = request.getParameter("repass");
                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                String address = request.getParameter("address");
                String phonenumber = request.getParameter("phonenumber");
                int sex = Integer.parseInt(request.getParameter("sex"));
                String age = request.getParameter("age");
                String card = request.getParameter("card");
                ResultSet rs = dao.getData("select email from Customer");
                while (rs.next()) {
                    if (email.equals(rs.getString(1))) {
                        check = false;
                    }
                }
                int dem = 0;
                if (email.isEmpty() || pass.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || address.isEmpty() || phonenumber.isEmpty() || age.isEmpty() || card.isEmpty()) {
                    check = false;
                }
				
				String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
				java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
				java.util.regex.Matcher m = p.matcher(email);
				if (m.matches()) dem++;
				
                for (int i = 0; i < email.length(); i++) {
                    if (email.charAt(i) == '@') {
                        dem++;
                    }
                }
                if (dem != 1) {
                    check = false;
                }
                if (!pass.equals(repass)) {
                    check = false;
                }
                for (int i = 0; i < phonenumber.length(); i++) {
                    if (phonenumber.charAt(i) < '0' || phonenumber.charAt(i) > '9') {
                        check = false;
                    }
                }
                int xage = 0;
                try {
                    xage = Integer.parseInt(age);
                } catch (Exception e) {
                    check = false;
                }
                if (xage <= 0) {
                    check = false;
                }
                if (check == true) {

                    dao.getData("insert into Customer(email, pass, firstname, lastname, addr, phonenumber, sex, age, cardnumber) \n"
                            + "values('" + email + "','" + pass + "','" + firstname + "','" + lastname + "','" + address + "','" + phonenumber + "'," + sex + "," + xage + ",'" + card + "')");
                    session.setAttribute("msg", "Register Successful");
                    response.sendRedirect("index.jsp?service=home");
                } else {
					
                    session.setAttribute("msg", "Register Failed, please register again");
                    response.sendRedirect("index.jsp?service=preregister");
                }

            } else if (service.equals("login")) {
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    ResultSet rs = dao.getData("select * from Customer where email='" + email + "' and pass='" + password + "'");
                    if (rs.next()) {
                        session.setAttribute("cus", new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10)));
                        session.setAttribute("msg","Login sucessfully")
                        response.sendRedirect("index.jsp?service=home");
                    } else {
                        response.sendRedirect("index.jsp?service=prelogin");
                    }
                

            }
        } finally {
            out.close();
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
