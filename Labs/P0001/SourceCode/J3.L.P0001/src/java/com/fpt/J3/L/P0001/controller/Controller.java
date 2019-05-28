/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.J3.L.P0001.controller;

import com.fpt.J3.L.P0001.entity.Quiz;
import com.fpt.J3.L.P0001.entity.Result;
import com.fpt.J3.L.P0001.entity.Users;
import com.fpt.J3.L.P0001.model.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Students
 */
public class Controller extends HttpServlet {

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
            ServletContext sc = getServletContext();
            DAO dao = new DAO(sc);
            HttpSession session = request.getSession(true);
            Users u = (Users) session.getAttribute("loginBean");
            String service = request.getParameter("service");
            if (service.equals("logout")) {  //logout website
                session.removeAttribute("loginBean");
                dispatch(request, response, "/home.jsp");
            }
            if (service.equals("register")) { //register new user
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                String type = request.getParameter("type");
                int typeInt = 0;
                if (type.equals("Teacher")) {
                    typeInt = 1;
                } else if (type.equals("Normal User")) {
                    typeInt = 2;
                }
                String email = request.getParameter("email");
                Users newUser = new Users(userName, password, typeInt, email);
                dao.addUser(newUser);
                dispatch(request, response, "/home.jsp");
            }
            if (service.equals("makequiz")) { // make a new  quiz
                String question = request.getParameter("question");
                String answer1 = request.getParameter("answer1");
                String answer2 = request.getParameter("answer2");
                String answer3 = request.getParameter("answer3");
                String answer4 = request.getParameter("answer4");
                String[] answerRightArray = request.getParameterValues("answerRight");
                String answerRight = "";
                for (int i = 0; i < answerRightArray.length; i++) {
                    if (i == (answerRightArray.length - 1)) {
                        answerRight += answerRightArray[i];
                    } else {
                        answerRight += answerRightArray[i] + " | ";
                    }
                }
                Quiz q = new Quiz(u.getUserID(), question, answer1, answer2, answer3, answer4, answerRight);
                dao.addQuiz(q);
                dispatch(request, response, "/home.jsp?goPage=makequiz");
            }

            if (service.equals("managequiz")) {
                String sql = "select quizID, question, dateCreated from Quiz join Users on quiz.userID = users.userID where Users.userID = '" + u.getUserID() + "'";
                ResultSet rs = dao.getData(sql);
                int cnt = 0;
                while (rs.next()) {
                    cnt++;
                }
                rs.beforeFirst();
                request.setAttribute("rsManage", rs);
                request.setAttribute("cnt", cnt);
                dispatch(request, response, "/home.jsp?goPage=managequiz");
            }

            if (service.equals("getQuiz")) { //get the set of quiz
                try {
                    int numQuestion = Integer.parseInt(request.getParameter("numQuestion"));
                    String sql = "select * from quiz";
                    ResultSet rsTotalQuiz = dao.getData(sql);
                    ArrayList<Quiz> listTakeQuiz = new ArrayList<>();
                    ArrayList<Quiz> listTotalQuiz = new ArrayList<>();
                    while (rsTotalQuiz.next()) { // Add all quiz to ArrayList
                        Quiz q = new Quiz(rsTotalQuiz.getInt(1), rsTotalQuiz.getInt(2), rsTotalQuiz.getString(3), rsTotalQuiz.getString(4), rsTotalQuiz.getString(5), rsTotalQuiz.getString(6), rsTotalQuiz.getString(7), rsTotalQuiz.getString(8), rsTotalQuiz.getDate(9));
                        listTotalQuiz.add(q);
                    }
                    if (numQuestion == 0 || numQuestion > listTotalQuiz.size()) {
                        throw new Exception();
                    } else {
                        for (int i = 0; i < numQuestion; i++) {
                            int rand = (int) (Math.random() * listTotalQuiz.size());
                            listTakeQuiz.add(listTotalQuiz.get(rand));
                            listTotalQuiz.remove(rand);
                        }
                        session.setAttribute("listTakeQuiz", listTakeQuiz);
                        int score = 0;
                        session.setAttribute("score", score); // init score = 0
                        int timeRemain = numQuestion * 10 * 1000; // init time to takequiz, 10s/question
                        session.setAttribute("timeRemain", timeRemain);
                        u.setTestState(0);
                        dispatch(request, response, "/home.jsp?goPage=takequiz");
                    }
                } catch (Exception e) {
                    dispatch(request, response, "/home.jsp?goPage=takequiz");
                }

            }

            if (service.equals("nextQuiz")) { // go next quiz
                ArrayList<Quiz> listTakeQuiz = (ArrayList<Quiz>) session.getAttribute("listTakeQuiz");
                int score = (int) session.getAttribute("score");
                String[] answerArray = request.getParameterValues("answer");
                if (answerArray != null) {
                    String answer = "";
                    for (int i = 0; i < answerArray.length; i++) {
                        if (i == (answerArray.length - 1)) {
                            answer += answerArray[i];
                        } else {
                            answer += answerArray[i] + " | ";
                        }
                    }
                    if (answer.equals(listTakeQuiz.get(u.getTestState()).getAnswerRight())) {
                        session.setAttribute("score", (score += 1));
                    }
                }
                if (u.getTestState() + 1 == listTakeQuiz.size()) {
                    u.setTestState(-2);
                    Result result = new Result(u.getUserID(), listTakeQuiz, score * 1.0 / listTakeQuiz.size());
                    dao.addResult(result);
                    response.sendRedirect("home.jsp?goPage=takequiz");
                } else {
                    try {
                        int timeRemain = Integer.parseInt(request.getParameter("timeRemain"));
                        session.setAttribute("timeRemain", timeRemain);
                    } catch (Exception e) {

                    }
                    u.setTestState(u.getTestState() + 1);
                    dispatch(request, response, "/home.jsp?goPage=takequiz");
                }
            }

            if (service.equals("finishTest")) {
                ArrayList<Quiz> listTakeQuiz = (ArrayList<Quiz>) session.getAttribute("listTakeQuiz");
                u.setTestState(listTakeQuiz.size() - 1);
                dispatch(request, response, "/Controller?service=nextQuiz");
            }
            if (service.equals("newTakeQuiz")) {
                u.setTestState(-1);
                dispatch(request, response, "/home.jsp?goPage=takequiz");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
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

    private void dispatch(HttpServletRequest request, HttpServletResponse respone, String page) throws IOException, ServletException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
        dispatcher.forward(request, respone);
    }
}
