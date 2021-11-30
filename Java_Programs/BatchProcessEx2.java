//5.Example of Batch processing using PreparedStatement.
import java.io.*;
import java.sql.*;
public class BatchProcessEx2 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
          System.out.println("Connection Established");
          PreparedStatement pstmt=con.prepareStatement("Insert into User Values (?,?,?)");
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          while(true){
              System.out.println("Enter a UserId: ");
              String s1=br.readLine();
              int id=Integer.parseInt(s1);

              System.out.println("Enter a User Name: ");
              String name=br.readLine();

              System.out.println("Enter a Password: ");
              String pwd=br.readLine();

              pstmt.setInt(1,id);
              pstmt.setString(2,name);
              pstmt.setString(3,pwd);
              pstmt.addBatch();

              System.out.println("Want to add more records y/n: ");
              String answer=br.readLine();
              if(answer.equals("n")){
                  break;
              }

          }
            pstmt.executeBatch();

          System.out.println("Record successfully saved");
          con.close();
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
