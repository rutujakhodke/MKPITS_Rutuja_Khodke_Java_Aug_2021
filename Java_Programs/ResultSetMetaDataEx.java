import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.concurrent.Callable;

public class ResultSetMetaDataEx {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
       System.out.println("Connection Established");
       Statement stmt=con.createStatement();
       //Retrieving the data
       ResultSet rs=stmt.executeQuery("Select * from User");
       ResultSetMetaData rsMetaData=rs.getMetaData();
       //Number of Columns
        System.out.println("Number of Columns: "+rsMetaData.getColumnCount());
        //Column Name
        System.out.println("Name of Column is: " +rsMetaData.getColumnName(3));
        //Column Label
        System.out.println("Column Label is: " +rsMetaData.getColumnLabel(1));
        //Table Name
        System.out.println("Table Name is: " +rsMetaData.getTableName(1));
    }
}
