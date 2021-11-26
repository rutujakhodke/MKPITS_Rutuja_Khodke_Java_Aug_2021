//3.Program to delete record in Students table.
import java.sql.*;
public class SampleDelete {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            System.out.println("Successfully Connected");
          Statement stmt=con.createStatement();
           String query="Delete from Students where Student_id=2";
           stmt.executeUpdate(query);
           System.out.println("Record Deleted Successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
