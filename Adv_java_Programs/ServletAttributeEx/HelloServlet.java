package com.example.servletattributeex;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        //request level attribute
           int a=10;//whe we have to interconnection in webapplications attribute object is used

        // Hello
        PrintWriter out = response.getWriter();
        String name=request.getParameter("uname");
       //application level attribute,we can use this in any servlet page.
        ServletContext sc=getServletContext();
        sc.setAttribute("Num1",a);
       // sc.removeAttribute("Num1");//it will remove the attribute value

        //request.setAttribute("Num1",a);
        RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
        try {
            rd.forward(request, response);
        } catch (Exception e) {
            out.println(e);
        }
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}