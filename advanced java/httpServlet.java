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
import java.util.Date;

public class httpServlet extends HttpServlet{
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    System.out.println("this is jeel method");
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    out.println("<h1>jeel patel </h1>");
    out.println(new Date().toString());
    }
}
