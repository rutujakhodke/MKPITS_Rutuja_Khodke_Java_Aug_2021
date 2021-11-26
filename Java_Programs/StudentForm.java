//2.Create Student form using Swing and MYSQL in JDBC.
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class StudentForm extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,b4;
    StudentForm(){
        setSize(600,540);
        setLayout(null);
        setVisible(true);
        setTitle("Student Form");

        l1=new JLabel("Enter a Student Roll No: ");
        l1.setBounds(30,50,150,35);
        add(l1);
        t1=new JTextField();
        t1.setBounds(200,50,160,30);
        add(t1);

        l2=new JLabel("Enter a Student Name: ");
        l2.setBounds(30,100,150,35);
        add(l2);
        t2=new JTextField();
        t2.setBounds(200,100,160,30);
        add(t2);

        l3=new JLabel("Enter a Student Address: ");
        l3.setBounds(30,150,150,35);
        add(l3);
        t3=new JTextField();
        t3.setBounds(200,150,160,30);
        add(t3);

        l4=new JLabel("Enter a Student Email Id: ");
        l4.setBounds(30,200,150,35);
        add(l4);
        t4=new JTextField();
        t4.setBounds(200,200,160,30);
        add(t4);

        l5=new JLabel("Enter a Student Mobile No: ");
        l5.setBounds(30,250,160,35);
        add(l5);
        t5=new JTextField();
        t5.setBounds(200,250,160,30);
        add(t5);

        b1=new JButton("Save");
        b1.setBounds(30,300,100,35);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String query="Insert into Student1 (name,address,email,mobno) values('"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"') ";
                    stmt.executeUpdate(query);
                    con.close();
                    l6.setText("Record Saved ");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(140,300,100,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String query="Update Student1 set Address='"+t3.getText()+"' where Name= '"+t2.getText()+"' ";
                    stmt.executeUpdate(query);
                    con.close();
                    l6.setText("Record Updated ");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(250,300,100,35);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String query="Delete from Student1 where Name='"+t2.getText()+"' ";
                    stmt.executeUpdate(query);
                    con.close();
                    l6.setText("Record Deleted ");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(360,300,100,35);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String query="Select * from Student1 where Name='"+t2.getText()+"' ";
                    ResultSet rs=stmt.executeQuery(query);
                     int flag=0;
                     while (rs.next()){
                         flag=1;
                      t4.setText(rs.getString(4));
                      l6.setText("Record found");
                     }
                     if(flag==0){
                         l6.setText("No record found");
                     }
                    con.close();
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l6=new JLabel("Status: ");
        l6.setBounds(40,360,150,35);
        add(l6);

    }
    public static void main(String[] args){
        StudentForm s1=new StudentForm();
    }
}
