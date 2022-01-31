package com.example.jdbc2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//@WebServlet(name = "ServletP3", value = "/ServletP3")
public class ServletP3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname=request.getParameter("uname");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
            out.println("Successfully Database Connected");
            PreparedStatement ps=con.prepareStatement("select * from logint where uname=?");
            ps.setString(1,uname);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                //out.println("uname: " + rs.getString(1) + "</br> password: " + rs.getString(2));
                        out.println("Successful");
            }else{
                out.println("Error");
            }
            }catch(Exception e){
        out.println(e);
        }
    }
}
