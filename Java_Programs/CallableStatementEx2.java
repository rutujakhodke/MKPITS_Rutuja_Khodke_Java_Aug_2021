import java.sql.*;
public class CallableStatementEx2 {
    static final String QUERY="{call getProductName (?,?)}";
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
          CallableStatement stmt=con.prepareCall(QUERY);
          //binding parameters
            stmt.setInt(1,116);
            stmt.registerOutParameter(2, Types.VARCHAR);
            stmt.execute();
            String prodname=stmt.getString(2);
            System.out.println("Product name for product id '116' is " +prodname);
        }catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
