//3.Program to Delete record from Employee Table.
import java.sql.*;
public class SampleDelete1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
           System.out.println("Successfully Connected");
           Statement stmt=con.createStatement();
            String query="Delete from Employee where EMPNO=101";
            stmt.executeUpdate(query);
            System.out.println("Record Deleted Successfully");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
