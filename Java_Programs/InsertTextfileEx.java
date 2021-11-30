//1.Program to save the file in mytable table.
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;
import java.sql.*;
public class InsertTextfileEx {
    public static void main(String[] args){
        PreparedStatement pstmt;
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
          System.out.println("Connection Established");
          File file=new File("E:\\Images1\\Mysqltext.txt");
          FileInputStream fis =null;
          conn.setAutoCommit(false);//by default it is true
          fis = new FileInputStream(file);
          pstmt=conn.prepareStatement("Insert into Mytable (Name,Image) Values (?,?)");
          pstmt.setString(1,"Hello");
          pstmt.setAsciiStream(2,fis,(int) file.length());
          pstmt.executeUpdate();
          conn.commit();
          pstmt.close();
          fis.close();
          conn.close();
          System.out.println("File Saved Successfully in Table");
        }catch (Exception ee){
            System.err.println("Error: " + ee.getMessage());
              ee.printStackTrace();
        }finally{

        }
    }
}
