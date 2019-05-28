package com.fpt.lab221.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Students
 */
@MultipartConfig

public class UploadServlet extends HttpServlet {

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
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
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
        Part uploadedFile = request.getPart("imgLink");
        String imgLink = null;
        if (uploadedFile != null) {
            String realPath = request.getServletContext().getRealPath("");
            String realPath2 = request.getContextPath();
            char[] b = realPath2.toCharArray();
            int i = 1;
            String s = "";
            while (i < b.length) {
                s += b[i];
                i++;
            }
            int checkPoint = realPath.indexOf(s);
            realPath = realPath.substring(0, checkPoint + realPath2.length() - 1);
            String finalSavePath = realPath + File.separatorChar + "build" + File.separatorChar + "web" + File.separatorChar + "imgS";
            File file = new File(finalSavePath);
            if (!file.exists()) {
                file.mkdir();
            }
            String fileName = uploadedFile.getSubmittedFileName();
            uploadedFile.write(finalSavePath + File.separatorChar + fileName);
            imgLink = finalSavePath + File.separatorChar + fileName;
            imgLink = "imgS/" + fileName;
        }
        String content = request.getParameter("content");
        String name = request.getParameter("nameInput");
        String email = request.getParameter("email");
        String website = request.getParameter("website");
        if (content == null) {
            content = "Happy Wedding";
        }
        if (name == null && email == null && website == null) {
            name = "No INF";
            email = "No INF";
            website = "No INF";
        }
        DatabaseInvoke db = new DatabaseInvoke();
        ServletContext sc = getServletContext();
        db.connectToDatabase(sc);

        db.insertToGuestBook(name, email, website, imgLink, content);
        response.sendRedirect("Guestbook.jsp");
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
