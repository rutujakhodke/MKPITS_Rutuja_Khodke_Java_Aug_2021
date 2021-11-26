//1.Program to Insert record into Employee Table
import java.sql.*;
public class SampleInsert1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
           System.out.println("Successfully Connected");
           Statement stmt=con.createStatement();
            String query="Insert into Employee(EMPNO,EMPNAME,ADDRESS) values(107,'Jordon','Hyderabad')";
            stmt.executeUpdate(query);
            System.out.println("Record Inserted Successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
      }
    }

