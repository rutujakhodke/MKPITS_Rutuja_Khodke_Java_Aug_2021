//5.Java Awt event example.Wap to accept 3 subject marks and display total,percentage and grade.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx5 extends Frame implements ActionListener{
 Label l1,l2,l3,l4,l5,l6;
 TextField t1,t2,t3;
 Button b1;
 public AwtEventEx5(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Student Result");

  l1=new Label("Sub1  Marks:");
  l1.setBounds(40,70,100,35);
  add(l1);
  t1=new TextField();
  t1.setBounds(140,70,90,30);
  add(t1);

  l2=new Label("Sub2  Marks:");
  l2.setBounds(40,120,100,35);
  add(l2);
  t2=new TextField();
  t2.setBounds(140,120,90,30);
  add(t2);

  l3=new Label("Sub3  Marks:");
  l3.setBounds(40,170,100,35);
  add(l3);
  t3=new TextField();
  t3.setBounds(140,170,90,30);
  add(t3);

  b1=new Button("Result: ");
  b1.setBounds(150,220,100,35);
  b1.addActionListener(this);
  add(b1);

 l4=new Label("Total: ");
 l4.setBounds(40,250,100,35);
 add(l4);

 l5=new Label("Percentage: ");
 l5.setBounds(40,300,100,35);
 add(l5);

 l6=new Label("Grade: ");
 l6.setBounds(40,350,150,35);
 add(l6);
 }
 public void actionPerformed(ActionEvent ae){
  int s1=Integer.parseInt(t1.getText());
  int s2=Integer.parseInt(t2.getText());
  int s3=Integer.parseInt(t3.getText());
   int total=0;
   float per=0f;
   String grade=null;
   if(ae.getSource() == b1){
    total=s1+s2+s3;

    per=(float)(total/ 300.0f) * 100.0f;

    if(per>=75)
     grade="Distinction";

    else if(per>=60 && per<75)
     grade="First";

    else
     grade="Fail";

   }
   l4.setText("Total is : " +total);
   l5.setText("Percentage is : " +per);
   l6.setText("Grade is : " +grade);
 }
 public static void main(String args[]){
  AwtEventEx5 e=new AwtEventEx5();
 }
}