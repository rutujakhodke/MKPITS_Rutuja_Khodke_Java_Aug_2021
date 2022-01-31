package com.example.jdbc2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.plaf.nimbus.State;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

//@WebServlet(name = "ServletP2", value = "/ServletP2")
public class ServletP2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
       String name = request.getParameter("uname");
       String password=request.getParameter("pass");

        PrintWriter out = response.getWriter();
        out.println(name);
        out.println(password);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
            out.println("Successfully Database Connected");
            Statement stmt=con.createStatement();
            String query=("insert into logint values ('"+name+"','"+password+"')");
            stmt.executeUpdate(query);
            out.println("Record inserted Successfully");
        }catch(Exception ee){
            out.println(ee);
        }
    }


}



