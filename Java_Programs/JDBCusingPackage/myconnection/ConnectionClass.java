package com.mkpits.myconnection;
import java.sql.*;
public class ConnectionClass {
    public static Connection createConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
         return con;
    }
}
