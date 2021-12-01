//2.Example of PreparedStatement with swing to insert,update,delete and search record in Mysql.
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class UsersForm extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2,b3,b4;
    UsersForm(){
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setTitle("Users Login form");

        l1=new JLabel("UserName: ");
        l1.setBounds(40,50,100,35);
        add(l1);
        t1=new JTextField();
        t1.setBounds(150,50,150,35);
        add(t1);

        l2=new JLabel("Password: ");
        l2.setBounds(40,100,100,35);
        add(l2);
        p1=new JPasswordField();
        p1.setBounds(150,100,150,35);
        add(p1);

        b1=new JButton("Save");
        b1.setBounds(50,150,100,35);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                  System.out.println("Connection Established");
                  String query="Insert into Users (Username,Password) values (?,?)";
                  PreparedStatement pstmt=con.prepareStatement(query);
                  pstmt.setString(1,t1.getText());
                  pstmt.setString(2,p1.getText());
                  int res= pstmt.executeUpdate();
                  con.close();
                  l3.setText("Record Saved in Users table");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(170,150,100,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Connection Established");
                    String query="Update Users set Password=? where Username=?";
                    PreparedStatement pstmt=con.prepareStatement(query);
                    String uname=t1.getText();
                    String pwd=p1.getText();
                    pstmt.setString(1,pwd);
                    pstmt.setString(2,uname);
                    int res=pstmt.executeUpdate();
                    System.out.println(res+ "Record Updated in Users table");
                    con.close();
            }catch (Exception ee){
                    System.out.println(ee.toString());
                }
        }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(50,200,100,35);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Connection Established");
                    PreparedStatement pstmt=con.prepareStatement("Delete from Users where Username=?");
                    String uname=t1.getText();
                    pstmt.setString(1,uname);
                    int res=pstmt.executeUpdate();
                    System.out.println(res+ "Record Deleted from Users table");
                    con.close();
            }catch (Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(170,200,100,35);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Connection Established");
                    PreparedStatement pstmt=con.prepareStatement("Select * from Users where Username=?");
                    String uname=t1.getText();
                    pstmt.setString(1,uname);
                    ResultSet rs=pstmt.executeQuery();
                    int flag=0;
                    while (rs.next()){
                      l3.setText("");
                        flag=1;
                p1.setText(rs.getString(3));
                    }
                    if(flag==0){
                        p1.setText("");
                        l3.setText("No Record found from Users table");
                    }
                    con.close();
                }catch (Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l3=new JLabel("Status: ");
        l3.setBounds(50,250,250,35);
        add(l3);
    }
    public static void main(String[] args){
        UsersForm form=new UsersForm();
    }
}
