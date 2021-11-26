//4.Program to Select record from Employee Table.
import java.sql.*;
public class SampleSelect1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
           Statement stmt=con.createStatement();
            String query="Select * from Employee";
            ResultSet rs=stmt.executeQuery(query);
             while(rs.next()){
            System.out.println("Empno " +rs.getInt(1)+ " Empname " +rs.getString(2)+ " Address " +rs.getString(3));
        }
             con.close();
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
