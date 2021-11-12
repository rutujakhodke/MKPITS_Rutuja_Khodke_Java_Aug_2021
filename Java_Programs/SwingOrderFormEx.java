//2.Order Form using Swing.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingOrderFormEx extends Frame implements ActionListener{
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
 JTextField t1,t2,t3;
 JComboBox cb;
 JButton b1;
 public SwingOrderFormEx(){
  setSize(400,600);
  setVisible(true);
  setLayout(null);
  setTitle("Order Form");

  l1=new JLabel("Order Form");
  l1.setBounds(150,50,120,35);
  add(l1);

  l2=new JLabel("Customer Name: ");
  l2.setBounds(30,100,120,35);
  add(l2);
  t1=new JTextField();
  t1.setBounds(160,100,180,35);
  add(t1);

  l3=new JLabel("Product Name: ");
  l3.setBounds(30,160,120,35);
  add(l3);
  String productname[]={"AC","TV","Mobile","Laptop","Fridge","Mouse","Keyboard"};

  cb=new JComboBox(productname);
  cb.setBounds(160,160,90,30);
  add(cb);

  l4=new JLabel("Product Price: ");
  l4.setBounds(30,210,120,35);
  add(l4);
  t2=new JTextField();
  t2.setBounds(160,210,180,35);
  add(t2);

  l5=new JLabel("Product Quantity: ");
  l5.setBounds(30,260,120,35);
  add(l5);
  t3=new JTextField();
  t3.setBounds(160,260,180,35);
  add(t3);

  b1=new JButton("Order");
  b1.setBounds(150,310,100,35);
  b1.addActionListener(this);
  add(b1);

  l6=new JLabel("Customer Name: ");
  l6.setBounds(30,350,180,30);
  add(l6);

  l7=new JLabel("Product Name: ");
  l7.setBounds(30,390,180,30);
  add(l7);

  l8=new JLabel("Price: ");
  l8.setBounds(30,430,180,30);
  add(l8);

  l9=new JLabel("Quantity: ");
  l9.setBounds(30,470,180,30);
  add(l9);

  l10=new JLabel("Total Amount: ");
  l10.setBounds(30,510,180,30);
  add(l10);
  }
  public void actionPerformed(ActionEvent ae){
   l6.setText("Customer Name: "+t1.getText());

   l7.setText("Productname: "+ cb.getItemAt(cb.getSelectedIndex()));

   l8.setText("Price: " +t2.getText());

   l9.setText("Quantity: "+t3.getText());

   float price=Float.parseFloat(t2.getText());
   int quantity=Integer.parseInt(t3.getText());
   float totalAmt=0;
   if(ae.getSource() == b1){
	   totalAmt=price*quantity;
	  l10.setText("Total Amount: "+totalAmt);
	 }
  }
  public static void main(String args[]){
  SwingOrderFormEx sw=new SwingOrderFormEx();
  }
}