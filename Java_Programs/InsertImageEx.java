import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.io.*;
public class InsertImageEx {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
          System.out.println("Connection Established");
          File file=new File("E:\\Cartoonstar.jpg");
          FileInputStream fis=new FileInputStream(file);
          PreparedStatement ps=con.prepareStatement("Insert into Mytable (Name,Image) Values (?,?)");
          ps.setString(1,"Star");
          ps.setBinaryStream(2,fis,(int) file.length());
          ps.executeUpdate();
          System.out.println("Image saved in Database Successfully");
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
