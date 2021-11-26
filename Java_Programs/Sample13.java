import java.sql.*;
public class Sample {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
            System.out.println("Successfully Connected");
        }
        catch(Exception ee){
            System.out.println(ee.toString());
        }
    }
}
