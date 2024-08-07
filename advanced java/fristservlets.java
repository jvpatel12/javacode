/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;

/**
 *
 * @author lenovo
 */

import java.io.IOException;
import javax.servlet.*;
public  class fristservlets implements Servlet{
    //life cycle method
    ServletConfig conf;
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("creating the object......");
    }
        public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException{
            System.out.println("serviceing......");
            } 
        public void destroy(){
        System.out.println("serviceing is destory that time ");
        }
        
        //non lilfe cycle method
        public ServletConfig getServletConfig() {
         return this.conf;
        }
        
        public String getServletInfo(){
        return "this is servlets created by jeel patel";
        }

   
}
