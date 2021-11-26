//1.Create User form using mysql and Swing in JDBC.
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class UserForms extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2,b3,b4;
    UserForms(){
        setSize(400,500);
        setLayout(null);
        setVisible((true));
       l1=new JLabel("UserName: ");
       l1.setBounds(30,50,100,35);
       add(l1);
       t1=new JTextField();
       t1.setBounds(130,50,150,30);
       add(t1);

       l2=new JLabel("Password: ");
       l2.setBounds(30,110,100,35);
       add(l2);
       p1=new JPasswordField();
       p1.setBounds(130,110,150,30);
       add(p1);

       b1=new JButton("Save");
       b1.setBounds(30,170,100,35);
       b1.addActionListener(new ActionListener(){
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    try{
                                        Class.forName("com.mysql.jdbc.Driver");
                                      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                                      Statement stmt=con.createStatement();
                                       String query="Insert into Users (Username,Password) values('"+t1.getText()+"','"+p1.getText()+"')";
                                       stmt.executeUpdate(query);
                                       con.close();
                                       l3.setText("Record Saved ");
                                    }catch(Exception ee){
                                        System.out.println(ee.toString());
                                    }
                                }
                            });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(140,170,100,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                  System.out.println("Successfully Connected");
                  Statement stmt=con.createStatement();
                  String query="Update Users set password='"+p1.getText()+"' where Username='"+t1.getText()+"' ";
                  stmt.executeUpdate(query);
                  con.close();
                  l3.setText("Record Updated");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(250,170,100,35);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                  System.out.println("Successfully connected");
                  Statement stmt=con.createStatement();
                  String query="Delete from Users where Username='"+t1.getText()+"' ";
                   stmt.executeUpdate(query);
                   con.close();
                   l3.setText("Record Deleted");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(100,220,100,35);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                  System.out.println("Successfully Connected");
                  Statement stmt=con.createStatement();
                  String query="Select * from Users where Username= '"+t1.getText()+"' ";
                  ResultSet rs=stmt.executeQuery(query);
                    int flag=0;
                   while (rs.next()){
                       flag=1;
                 p1.setText(rs.getString(3));
                 l3.setText("Record Found");
                   }
                    if (flag==0) {
                        l3.setText("No record Found");
                    }
                   con.close();
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l3=new JLabel("Status: ");
        l3.setBounds(30,290,130,30);
        add(l3);
    }
    public static void main(String[] args){
       UserForms uf=new UserForms();
    }
}
