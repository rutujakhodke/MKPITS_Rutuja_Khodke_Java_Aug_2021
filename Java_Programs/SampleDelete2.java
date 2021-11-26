//3.Program to Delete the record from User Table.
import java.sql.*;
public class SampleDelete2 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
          System.out.println("Successfully Connected");
          Statement stmt=con.createStatement();
          String query="Delete from User where userid=113";
          stmt.executeUpdate(query);
          System.out.println("Record deleted successfully");
        }catch(Exception ee) {
            System.out.println(ee.toString());
        }
    }
}
