//1.Program to Insert record into User Table.
import java.sql.*;
public class SampleInsert2 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
          System.out.println("Successfully Connected");
          Statement stmt= con.createStatement();
           String query="Insert into User(USERNAME,PASSWORD) values('Jay','accb'),('Smith','defg')";
           stmt.executeUpdate(query);
           System.out.println("Reccord inserted Successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
