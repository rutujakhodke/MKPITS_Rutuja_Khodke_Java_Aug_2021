//4.Program to Select the record from User Table.
import java.sql.*;
public class SampleSelect2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
          System.out.println("Successfully connected");
          Statement stmt=con.createStatement();
           String query="Select * from User";
           ResultSet rs=stmt.executeQuery(query);
           while (rs.next()){
               System.out.println("UserId " +rs.getInt(1)+" UserName " +rs.getString(2)+" Password " +rs.getString(3));
           }
           con.close();
           System.out.println("Record Viewed");
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
