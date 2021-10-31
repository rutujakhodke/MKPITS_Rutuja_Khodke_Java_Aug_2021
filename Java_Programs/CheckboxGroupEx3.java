//3.Java Awt CheckboxGroup example.create a Account details and create whether it is deposit or withdrawl transaction using checkboxGroup.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroupEx3 extends Frame{
 Label l1,l2,l3;
 TextField t1,t2;
 Checkbox cb1,cb2;
 CheckboxGroup cbg1;
 Button b1;
 public CheckboxGroupEx3(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Account Details");

  l1=new Label("Enter a Account Number:-");
  l1.setBounds(40,50,140,35);
  add(l1);
  t1=new TextField();
  t1.setBounds(190,50,100,30);
  add(t1);

  l2=new Label("Enter a Amount:-");
  l2.setBounds(40,100,120,35);
  add(l2);
  t2=new TextField();
  t2.setBounds(190,100,100,30);
  add(t2);

  cbg1=new CheckboxGroup();
  cb1=new Checkbox("Deposit",cbg1,true);
  cb1.setBounds(50,140,80,80);
  add(cb1);

  cb2=new Checkbox("Withdrawl",cbg1,false);
  cb2.setBounds(150,140,80,80);
  add(cb2);

  b1=new Button("Submit");
  b1.setBounds(150,240,100,35);
  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
   int accno=Integer.parseInt(t1.getText());
   int amount=Integer.parseInt(t2.getText());
    int balance=1000;
    int interest=300;
    if(cb1.getState() == true){
     balance=balance+amount+interest;
     l3.setText("Amount deposited is: "+balance);
    }
    else if(cb2.getState() == true){
     balance=balance-amount;
     l3.setText("Amount Withdrawl is: "+balance);
    }
   }
  });
  add(b1);

  l3=new Label("Balance:");
  l3.setBounds(40,300,160,35);
  add(l3);
 }
 public static void main(String args[]){
  CheckboxGroupEx3 cbg=new CheckboxGroupEx3();
  }
}