package com.example.registrationform;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");

        //action logic to collect data from html form
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String gender=request.getParameter("gender");
        String course[] =request.getParameterValues("cb");
        String city=request.getParameter("city");
        String description=request.getParameter("desc");
        String dob=request.getParameter("dob");

        //display to browser

        out.println("<table>");
        out.println("<tr>");
        out.println("<td> Name: </td>");
        out.println("<td>" +name+ "<td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Password: </td>");
        out.println("<td>" +password+ "<td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Gender: </td>");
        out.println("<td>" +gender+ "<td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Courses: </td>");
        for(String s:course){
            out.println("<td>" +s+ "</td>");}
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> City: </td>");
        out.println("<td>" +city+ "<td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> Description: </td>");
        out.println("<td>" +description+ "<td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td> DOB: </td>");
        out.println("<td>" +dob+ "<td>");
        out.println("</tr>");

        out.println("</table>");

    }

    public void destroy() {
    }
}