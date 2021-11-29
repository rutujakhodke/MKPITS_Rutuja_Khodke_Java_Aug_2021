import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.*;
import java.io.*;
public class RetrieveImageEx {
    public static void main(String[] args){
        PreparedStatement ps;
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
          System.out.println("Connection Established");
          File file1=new File("E:\\Images2\\Cartoonstar.jpg");
          FileOutputStream fos=new FileOutputStream(file1);
          byte b[];//creating a byte array to store image
            Blob blob;
            ps=con.prepareStatement("Select * from Mytable");
            ResultSet rs=ps.executeQuery();
             while (rs.next()){
                 blob=rs.getBlob("Image");
             b=blob.getBytes(1,(int) blob.length());
               fos.write(b);
             }
             ps.close();
             fos.close();
             con.close();
             System.out.println("Image retrieved Successfully");
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
