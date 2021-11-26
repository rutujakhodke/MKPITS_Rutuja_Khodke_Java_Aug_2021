//4.Program to Select record from Students table.
import java.sql.*;
public class SampleSelect {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
          System.out.println("Successfully Connected");
          Statement stmt=con.createStatement();
           String query="Select * from Students";
          ResultSet rs=stmt.executeQuery(query);
           while(rs.next()){
               System.out.println("id " +rs.getInt(1)+" name " +rs.getString(2)+" course " +rs.getString(3));
           }
           con.close();
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
