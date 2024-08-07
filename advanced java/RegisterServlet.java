/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

/**
 *
 * @author lenovo
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>welcome to register servlet </h1>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");

        String cond = request.getParameter("condition");
        if (cond != null) {
            if (cond.equals("checked")) {
                out.println("<h2> name : " + name + "<h2>");
                out.println("<h2> password : " + password + "<h2>");
                out.println("<h2> email : " + email + "<h2>");
                out.println("<h2> gender : " + gender + "<h2>");
                out.println("<h2>course : " + course + "<h2>");
                
                
                 RequestDispatcher rd=request.getRequestDispatcher("suucessful");
                        rd.forward(request,response);
            } else {
                out.println("<h2>you have not acctpted terms</h2>");

            }
        } else {
            out.println("<h2>you have not acctpted terms</h2>");
                        RequestDispatcher rd=request.getRequestDispatcher("index.html");
                        rd.include(request,response);
        }

    }
}
