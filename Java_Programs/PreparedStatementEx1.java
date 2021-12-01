//3.Example of PreparedStatement to insert records until user press n.
import java.sql.*;
import java.io.*;
public class PreparedStatementEx1 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits12","root","");
            System.out.println("Connection Established");
            PreparedStatement pstmt=con.prepareStatement("Insert into Emp values (?,?)");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            do{
            System.out.println("Enter a Emp id: ");
            String s1=br.readLine();
            int id=Integer.parseInt(s1);

            System.out.println("Enter a Employee Name: ");
            String name=br.readLine();

            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            int res=pstmt.executeUpdate();
            System.out.println(res+ "Record inserted successfully");

            System.out.println("Do you want to continue:y/n");
            String ans=br.readLine();
            if(ans.startsWith("n")) {
                break;
            }
            }while(true);
            con.close();
        }catch (Exception ee){
            System.out.println(ee.toString());
        }
    }
}
