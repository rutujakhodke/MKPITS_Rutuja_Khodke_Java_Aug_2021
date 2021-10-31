//9.Java Awt event example.Wap to accept empno,empname,salary and display the bonus(35% if salary is greater than 20000,25% if salary is greater than 10000 otherwise bonus=15%).
import java.awt.*;
import java.awt.event.*;
class AwtEventEx9 extends Frame implements ActionListener{
 Label l1,l2,l3,l4,l5,l6;
 TextField t1,t2,t3;
 Button b1;
  public AwtEventEx9(){
  setSize(400,400);
  setVisible(true);
  setTitle("Employee Details");
  setLayout(null);

  //creating label for empno
  l1=new Label("Enter a Employee Number:-");
  l1.setBounds(30,80,160,35);
  add(l1);
  //creating textfield for empno
  t1=new TextField();
  t1.setBounds(200,80,100,30);
  add(t1);

  //creating label for empname
  l2=new Label("Enter a Employee Name:-");
  l2.setBounds(30,140,160,35);
  add(l2);
  t2=new TextField();
  t2.setBounds(200,140,100,30);
  add(t2);

  //creating label for salary
  l3=new Label("Enter a Employee Salary:-");
  l3.setBounds(30,200,160,35);
  add(l3);
  t3=new TextField();
  t3.setBounds(200,200,100,30);
  add(t3);

  //creating button for calculate bonus
  b1=new Button("Result");
  b1.setBounds(150,250,100,35);
  b1.addActionListener(this);
  add(b1);

  //creating label for bonus
  l4=new Label("Bonus:");
  l4.setBounds(30,290,170,35);
  add(l4);

  l5=new Label("Empname:");
  l5.setBounds(30,320,200,35);
  add(l5);

  l6=new Label("Total Salary:");
  l6.setBounds(30,350,170,35);
  add(l6);
  }
 public void actionPerformed(ActionEvent ae){
 int empno=Integer.parseInt(t1.getText());
 String empName=t2.getText();
 float salary=Float.parseFloat(t3.getText());
  float bonus=0;
  float totalSal=0;
  if(ae.getSource() == b1){
    if(salary>=20000){
	  bonus=(salary*35)/100;
	 }
	else if(salary>10000 && salary<20000){
	  bonus=(salary*25)/100;
	 }
	else{
	  bonus=(salary*15)/100;
     }
   l4.setText("Employee Bonus is: "+bonus);
 }
  l5.setText("Employee Name is: "+empName);
  totalSal=salary+bonus;
  l6.setText("Total salary is: "+totalSal);
}
public static void main(String args[]){
 AwtEventEx9 e=new AwtEventEx9();
 }
}