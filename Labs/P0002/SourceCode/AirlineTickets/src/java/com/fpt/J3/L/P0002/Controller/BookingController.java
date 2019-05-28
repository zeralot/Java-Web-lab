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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Students
 */
@WebServlet(name = "BookingController", urlPatterns = {"/BookingController"})
public class BookingController extends HttpServlet {

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
            HttpSession session = request.getSession();
            String service = request.getParameter("service");
            if (service.equals("add")) {
                int fid = Integer.parseInt(request.getParameter("fid"));
                Customer cus = (Customer) session.getAttribute("cus");
                if (cus == null) {
                    session.setAttribute("msg", "Please login to booking");
                    response.sendRedirect("index.jsp?service=prelogin");
                } else {
                    int cid = cus.getCid();
                    dao.getData("insert into Booking(cid,fid) values(" + cid + "," + fid + ")");
                    session.setAttribute("msg", "Booking successful");
                    ResultSet rs = dao.getData("select TOP 1 bid, Booking.cid, Flight.fid, bookingdate, Booking.fid, placefrom, placeto, depart, departtime, arrivetime, detail, cost, Customer.cid, email, pass, firstname, lastname, addr, phonenumber, sex, age, cardnumber from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid where Customer.cid=" + cid +"order by bid desc");
                    session.setAttribute("rsbooking", rs);
                    response.sendRedirect("index.jsp?service=managebookingresult");
                }
            }
            if (service.equals("search")) {
                ResultSet rs = null;
                Customer cus = (Customer) session.getAttribute("cus");
                if (cus == null) {
                    session.setAttribute("msg", "Please login to see your booking");
                    response.sendRedirect("index.jsp?service=prelogin");
                } else {
                    int cid = cus.getCid();
                    int type = Integer.parseInt(request.getParameter("typeBooking"));
                    if (type == 0) {
                        String code = request.getParameter("reservationCode");
                        rs = dao.getData("select * from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid where bid=" + code + "and Customer.cid=" + cid);
                    }
                    if (type == 1) {
                        rs = dao.getData("select * from Booking join Flight on Booking.fid=Flight.fid join Customer on Booking.cid=Customer.cid where Customer.cid=" + cid);
                    }
                    if (rs!=null){
                    session.setAttribute("rsbooking", rs);
                    response.sendRedirect("index.jsp?service=managebookingresult");
                    }
                    else {
                        session.setAttribute("msg", "Booking not found");
                        response.sendRedirect("index.jsp?service=managebookingsearch");
                    }
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
            Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(BookingController.class.getName()).log(Level.SEVERE, null, ex);
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
