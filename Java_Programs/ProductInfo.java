//3.Create a Product information table using Mysql and swing in JDBC.
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ProductInfo extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4;
    ProductInfo(){
        setSize(600,500);
        setLayout(null);
        setVisible(true);

        l1=new JLabel("Enter a Product Id: ");
        l1.setBounds(30,50,150,35);
        add(l1);
        t1=new JTextField();
        t1.setBounds(180,50,200,30);
        add(t1);

        l2=new JLabel("Enter a Product Name: ");
        l2.setBounds(30,100,150,35);
        add(l2);
        t2=new JTextField();
        t2.setBounds(180,100,200,30);
        add(t2);

        l3=new JLabel("Enter a Product Price: ");
        l3.setBounds(30,150,150,35);
        add(l3);
        t3=new JTextField();
        t3.setBounds(180,150,200,30);
        add(t3);

        l4=new JLabel("Enter a Product Quantity: ");
        l4.setBounds(30,200,150,35);
        add(l4);
        t4=new JTextField();
        t4.setBounds(180,200,200,30);
        add(t4);

        b1=new JButton("Save");
        b1.setBounds(40,260,100,35);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String query="Insert into Product (Prodname,Price,Quantity) values('"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"')";
                    stmt.executeUpdate(query);
                    con.close();
                    l5.setText("Record Saved ");
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        b2=new JButton("Update");
        b2.setBounds(150,260,100,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb", "root", "");
                    System.out.println("Successfully Connected");
                    Statement stmt = con.createStatement();
                    String query = "Update Product  set Price='" + t3.getText() + "' where Prodid='" + t1.getText() + "' ";
                    stmt.executeUpdate(query);
                    con.close();
                    l5.setText("Record Updated ");
                } catch (Exception ee) {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b2);

        b3=new JButton("Delete");
        b3.setBounds(260,260,100,35);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb", "root", "");
                    System.out.println("Successfully Connected");
                    Statement stmt = con.createStatement();
                    String query = "Delete from Product where Prodname='" + t2.getText() + "' ";
                    stmt.executeUpdate(query);
                    con.close();
                    l5.setText("Record Deleted ");
                } catch (Exception ee) {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b3);

        b4=new JButton("Search");
        b4.setBounds(370,260,100,35);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myspdb","root","");
                    System.out.println("Successfully Connected");
                    Statement stmt=con.createStatement();
                    String query="Select * from Product where ProdName='"+t2.getText()+"' ";
                    ResultSet rs=stmt.executeQuery(query);
                    int flag=0;
                    while (rs.next()){
                        flag=1;
                        t4.setText(rs.getString(4));
                        l5.setText("Record found");
                    }
                    if(flag==0){
                        l5.setText("No record found");
                    }
                    con.close();
                }catch(Exception ee){
                    System.out.println(ee.toString());
                }
            }
        });
        add(b4);

        l5=new JLabel("Status");
        l5.setBounds(30,310,150,35);
        add(l5);

    }
    public static void main(String args[]){
        ProductInfo prod=new ProductInfo();
    }
}
