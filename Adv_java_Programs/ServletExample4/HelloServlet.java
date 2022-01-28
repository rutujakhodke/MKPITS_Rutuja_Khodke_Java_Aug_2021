package com.example.servletex2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Welcome to Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
//        out.println(getServletConfig().getServletName());
//        out.println(getServletConfig().getServletContext());
        //out.println(getInitParameter("num1"));//it will print num1 =20 value
        int n1=Integer.parseInt(getInitParameter("num1"));
        int n2=Integer.parseInt(getInitParameter("num2"));
        out.println(n1+n2);

        out.println(getServletContext().getInitParameter("Country"));

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}