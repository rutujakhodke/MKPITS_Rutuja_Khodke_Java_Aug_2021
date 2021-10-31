//3.Java awt CheckBox example.Wap to accept a 2 no from user and display the addition of 2 no.(by using event handling button and checkbox).
import java.awt.*;
import java.awt.event.*;
class CheckboxEx3 extends Frame{
 Label l1,l2,l3;
 TextField t1,t2,t3;
 Checkbox cb1,cb2;
 Button b1;
 public CheckboxEx3(){
  setSize(500,500);
  setVisible(true);
  setTitle("Checkbox Example");
  setLayout(null);

  l1=new Label("Number1:-");
  l1.setBounds(40,50,100,35);
  add(l1);
  t1=new TextField();
  t1.setBounds(160,50,180,30);
  add(t1);

  l2=new Label("Number2:-");
  l2.setBounds(40,100,100,35);
  add(l2);
  t2=new TextField();
  t2.setBounds(160,100,180,30);
  add(t2);

  cb1=new Checkbox("Addition");
  cb1.setBounds(50,160,90,90);
  add(cb1);

  cb2=new Checkbox("Substraction");
  cb2.setBounds(180,160,90,90);
  add(cb2);

  b1=new Button("Calculate");
  b1.setBounds(180,260,100,35);
  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
   String str=t1.getText();
   int num1=Integer.parseInt(str);
   int num2=Integer.parseInt(t2.getText());

   int result=0;
   t3.setText("");
    if(cb1.getState() == true){
	  result=num1+num2;
	  t3.setText("Addition is: "+result);
	}
   if(cb2.getState() == true){
	  result=num1-num2;
	  String str1=t3.getText();
	  t3.setText(str1+ " substraction is: " +result);
	}
   }
  });
  add(b1);

  l3=new Label("Result :-");
  l3.setBounds(40,320,110,35);
  add(l3);
  t3=new TextField();
  t3.setBounds(160,320,180,30);
  add(t3);
 }
public static void main(String args[]){
 CheckboxEx3 cb=new CheckboxEx3();
 }
}