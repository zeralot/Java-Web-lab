/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0002.Controller;

import com.fpt.J3.L.P0002.Model.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Students
 */
@WebServlet(name = "FlightController", urlPatterns = {"/FlightController"})
public class FlightController extends HttpServlet {

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
            dao  = new DBConnect(getServletContext());
            HttpSession session = request.getSession();
            String service = request.getParameter("service");
            if (service.equals("search")) {

                String from = request.getParameter("from");
                String to = request.getParameter("to");
                String departure = request.getParameter("depart");
                String retur = request.getParameter("retur");
                int trip = Integer.parseInt(request.getParameter("trip"));
                ResultSet rs = null;
                if (trip == 1) {
                    rs = dao.getData("select * from Flight where placefrom='" + from + "' and placeto='" + to + "' and depart='" + departure + "'");

                } else if (trip == 0) {
                    rs = dao.getData("select * from Flight where (placefrom='" + from + "' and placeto='" + to + "' and depart='" + departure + "') or (placefrom='" + to + "' and placeto='" + from + "' and depart='" + retur + "')");
                }
                if (rs.isFirst()) {
                    session.setAttribute("msg", "Flight not found, please look for another flight");
                    response.sendRedirect("index.jsp?service=home");
                } else {
//                    if (trip == 1) {
//                        rs = dao.getData("select * from Flight where placefrom='" + from + "' and placeto='" + to + "' and depart='" + departure + "'");
//                    } else {
//                        rs = dao.getData("select * from Flight where (placefrom='" + from + "' and placeto='" + to + "' and depart='" + departure + "') or (placefrom='" + to + "' and placeto='" + from + "' and depart='" + retur + "')");
//                    }
                    session.setAttribute("rsflight", rs);
                    session.setAttribute("from", from);
                    session.setAttribute("to", to);
                    response.sendRedirect("index.jsp?service=list");
                }
            }
            if (service.equals("book")) {
                session.setAttribute("msg", "Please insert infomation about the flight you want");
                response.sendRedirect("index.jsp?service=home");
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
            Logger.getLogger(FlightController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(FlightController.class.getName()).log(Level.SEVERE, null, ex);
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
