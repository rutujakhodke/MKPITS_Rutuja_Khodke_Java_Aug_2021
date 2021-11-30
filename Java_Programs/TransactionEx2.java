//2.Example of Transaction Managment in JDBC using PreparedStatement.
import java.sql.*;
import java.util.*;
import java.io.*;
public class TransactionEx2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
           System.out.println("Connection Established");
           con.setAutoCommit(false);
           PreparedStatement pstmt=con.prepareStatement("Insert into Users values (?,?,?)");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           while (true){
               System.out.println("Enter User Id: ");
               String s1=br.readLine();
               int id=Integer.parseInt(s1);

               System.out.println("Enter a UserName: ");
               String name=br.readLine();

               System.out.println("Enter a Password: ");
               String pwd=br.readLine();
               pstmt.setInt(1,id);
               pstmt.setString(2,name);
               pstmt.setString(3,pwd);
               pstmt.executeUpdate();

               System.out.println("Commit/Rollback");
                 String answer=br.readLine();
                 if(answer.equals ("Commit")){
                     con.commit();
                 }
                 if(answer.equals("Rollback")) {
                     con.rollback();
                 }

                System.out.println("Want to add more Records y/n: ");
                 String ans=br.readLine();
                 if(ans.equals("n")){
                     break;
                  }
                 }
           con.commit();
           System.out.println("Record Saved Successfully");
           con.close();
           }catch (Exception ee){
              System.out.println(ee.toString());
         }
        }
    }

