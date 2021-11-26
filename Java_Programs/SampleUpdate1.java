//2.Program to Update record into Employee Table.
import java.sql.*;
public class SampleUpdate1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
           System.out.println("Successfully Connected");
           Statement stmt=con.createStatement();
            String query="Update Employee set Address='Chennai' where Empname='Kate'";
            stmt.executeUpdate(query);
            System.out.println("Record Updated Successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
