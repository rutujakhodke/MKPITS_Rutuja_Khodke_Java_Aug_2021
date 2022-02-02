package com.example.servletattributeex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", value = "/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("Welcome to Servlet 2");//here the HelloServlet is passing its request and response to the Servlet2
        out.println(request.getParameter("uname"));
        //out.println(request.getAttribute("Num1"));//it will get the attribute value on browser
        ServletContext sc=getServletContext();
        out.println(sc.getAttribute("Num1"));
    }
}
