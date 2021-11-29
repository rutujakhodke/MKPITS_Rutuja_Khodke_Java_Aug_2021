//1.Create a Callable Statement with Stored Procedure.
import java.sql.*;
public class CallableStatementEx {
    static final String QUERY="{call getEmpName (?,?)}";
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","");
          System.out.println("Connection Established");
          CallableStatement stmt=con.prepareCall(QUERY);
          //binding parameters
             stmt.setInt(1,27);
             stmt.registerOutParameter(2, Types.VARCHAR);
             stmt.execute();
             String ename=stmt.getString(2);
             System.out.println("Empname name for empno 27 is " +ename);
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
