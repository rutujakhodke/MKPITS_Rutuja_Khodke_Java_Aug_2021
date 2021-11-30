//4.Example of Batch Processing in JDBC.
import java.sql.*;
import java.util.*;
import java.io.*;
public class BatchProcessEx1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");//load driver class
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");//creating connection
          System.out.println("Connection Established");
          con.setAutoCommit(false);//by default it is true
          Statement stmt=con.createStatement();
          stmt.addBatch("Insert into Users Values (14,'Ramesh','abbc')");
          stmt.addBatch("Insert into Users Values (15,'Mayank','uvw')");
          stmt.executeBatch();//executing the batch
          con.commit();
          con.close();
          System.out.println("Record Saved");
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
