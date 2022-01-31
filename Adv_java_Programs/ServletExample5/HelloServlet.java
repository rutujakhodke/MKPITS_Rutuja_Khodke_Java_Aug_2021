package com.example.servletex3;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Servlet!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name=request.getParameter("uname");
        String password=request.getParameter("pass");
        // Hello
        PrintWriter out = response.getWriter();
        try{
            if(name.equals("Rutuja") & password.equals("abc")){
                //response.sendRedirect("www.google.com");//the page url will show on status bar
                RequestDispatcher rd = request.getRequestDispatcher("Success.html");//it will not show the next page url
                rd.forward(request,response);
            }else{
                //response.sendRedirect("Error.html");
                RequestDispatcher rd = request.getRequestDispatcher("Error.html");
                rd.include(request,response);
            }
        }catch (Exception e){
            out.println(e);
        }

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}