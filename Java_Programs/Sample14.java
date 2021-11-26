//1.Program to Insert record into Students table.
import java.sql.*;
public class Sample1 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            System.out.println("Successfully connected");
          Statement stmt=con.createStatement();
          String query="Insert into Students(STUDENT_ID,STUDENT_NAME,COURSE_NAME) VALUES(4,'JAY','PHP')";
          stmt.executeUpdate(query);
          System.out.println("Record saved Successfully");
        }
       catch(Exception ee){
            System.out.println(ee.toString());
       }
    }
}
