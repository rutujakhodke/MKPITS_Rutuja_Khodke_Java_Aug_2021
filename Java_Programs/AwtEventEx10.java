//10.Java Awt event example.Wap to accept customerName,productname,price,quantity and then display total amount.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx10 extends Frame implements ActionListener{
 Label l1,l2,l3,l4,l5;
 TextField t1,t2,t3,t4;
 Button b1;
 public AwtEventEx10(){
  setSize(400,400);
  setVisible(true);
  setTitle("Product Details");
  setLayout(null);

  //creating label for customer name
  l1=new Label("Enter a Customer Name:-");
  l1.setBounds(30,50,150,35);
  add(l1);
  //creating textfield for customer name
  t1=new TextField();
  t1.setBounds(190,50,100,30);
  add(t1);

  //creating label for product name
  l2=new Label("Enter a Product Name:-");
  l2.setBounds(30,90,150,35);
  add(l2);
  //creating textfield for product name
  t2=new TextField();
  t2.setBounds(190,90,100,30);
  add(t2);

  //creating label for price
  l3=new Label("Enter a Product Price:-");
  l3.setBounds(30,130,150,35);
  add(l3);
  //creating textfield for price
  t3=new TextField();
  t3.setBounds(190,130,100,30);
  add(t3);

  //creating label for quantity
  l4=new Label("Enter a Product Quantity:-");
  l4.setBounds(30,170,150,35);
  add(l4);
  //creating textfield for quantity
  t4=new TextField();
  t4.setBounds(190,170,100,30);
  add(t4);

  //creating button for calculation of total amount
  b1=new Button("Calculate");
  b1.setBounds(150,220,100,35);
  b1.addActionListener(this);
  add(b1);

  //creating label for Totalamount
  l5=new Label("Total Amount:");
  l5.setBounds(30,260,200,35);
  add(l5);
 }
 public void actionPerformed(ActionEvent ae){
 String custName=t1.getText();
 String prodName=t2.getText();
 float price=Float.parseFloat(t3.getText());
 int quantity=Integer.parseInt(t4.getText());
  float totalAmount=0;
  if(ae.getSource() == b1){
   totalAmount=quantity*price;
   }
     l5.setText("Total amount of product is: "+totalAmount);
   }
 public static void main(String args[]){
 AwtEventEx10 e=new AwtEventEx10();
 }
}