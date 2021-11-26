//2.Program to Update record from Students table.
import java.sql.*;
public class SampleUpdate {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
           System.out.println("Successfully connected");
          Statement stmt=con.createStatement();
           String query="Update Students set Course_name='Python' where Student_id=3";
           stmt.executeUpdate(query);
           System.out.println("Record Updated Successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
