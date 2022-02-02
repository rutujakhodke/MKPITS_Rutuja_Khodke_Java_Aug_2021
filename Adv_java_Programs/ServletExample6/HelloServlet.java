package com.example.servletex6;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)  throws IOException {
        response.setContentType("text/html");
     //here we have to connect HelloServlet to Servlet2 through requestDispatcher
        // Hello
        PrintWriter out = response.getWriter();
        //when we working with sendredirect it will take data from doget() method and it will generate new reponse everytime
        //response.sendRedirect("Servlet2");
       String name = request.getParameter("uname");
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