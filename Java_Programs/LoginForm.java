//4.Create a Login form using Mysql and swing in Jdbc.
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class LoginForm extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    LoginForm(){
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setTitle("Login Form");

        l1=new JLabel("UserName: ");
        l1.setBounds(40,50,100,35);
        add(l1);
        t1=new JTextField();
        t1.setBounds(140,50,150,30);
        add(t1);

        l2=new JLabel("Password: ");
        l2.setBounds(40,100,100,35);
        add(l2);
        p1=new JPasswordField();
        p1.setBounds(140,100,150,30);
        add(p1);

        b1=new JButton("Login");
        b1.setBounds(150,190,100,35);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    Statement stmt=con.createStatement();
                    String query="Select * from Users Where Username='"+t1.getText()+"' and Password='"+p1.getText()+"' ";
                    ResultSet rs=stmt.executeQuery(query);
                      int flag=0;
                      while (rs.next()){
                          flag = 1;

                      }
                      if(flag == 0){
                          l3.setText("Invalid Credentials");
                      }
                      else{
                          l3.setText("Login Successfull");
                      }
                    con.close();
                   }catch (Exception ee){
                     System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        l3=new JLabel("Status: ");
        l3.setBounds(30,240,130,35);
        add(l3);
    }
    public static void main(String args[]){
        LoginForm login=new LoginForm();
    }
}
