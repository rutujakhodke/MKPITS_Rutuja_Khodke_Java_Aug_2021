//2.Example of Transaction Managment using Statement.
import java.sql.*;
public class TransactionEx {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
          System.out.println("Connection Established");
          con.setAutoCommit(false);
          Statement stmt=con.createStatement();
          stmt.executeUpdate("Insert into Users values (5,'Abhi','aabc')");
          stmt.executeUpdate("Insert into Users values (6,'Umesh','pqr')");
          System.out.println("Insert values in Table Successfully");
          con.commit();
          con.close();
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
