//1.Example of Prepared Statement interface that inserts the records.
import java.sql.*;
public class PreparedStatementEx {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
          System.out.println("Connection Established");
          PreparedStatement pstmt=con.prepareStatement("Insert into Emp values (?,?)");
          pstmt.setInt(1,101);
          pstmt.setString(2,"Abhi");
          int res=pstmt.executeUpdate();
          System.out.println("Record Saved");
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }

}
