//4.Java Awt CheckboxGroup example.Create a Registration Form code.
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroupEx7 extends Frame implements ActionListener{
 Label l1,l2,l3,l4;
 TextField t1;
 Button b1;
 TextArea area;
 CheckboxGroup cbg1;
 Checkbox cb1,cb2,cb3,cb4;
 public CheckboxGroupEx7(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Registration Form");

  l1=new Label("Register YourSelf");
  l1.setBounds(140,30,100,35);
  add(l1);

  l2=new Label("Enter Your Name:- ");
  l2.setBounds(30,90,120,35);
  add(l2);
  t1=new TextField();
  t1.setBounds(170,90,140,30);
  add(t1);

  l3=new Label("Select  Course:- ");
  l3.setBounds(30,130,120,35);
  add(l3);

  cb1=new Checkbox("C++",false);
  cb1.setBounds(150,130,60,60);
  add(cb1);

  cb2=new Checkbox("Java",true);
  cb2.setBounds(210,130,60,60);
  add(cb2);

  l4=new Label("Select  Gender:- ");
  l4.setBounds(30,180,120,35);
  add(l4);
  cbg1=new CheckboxGroup();
  cb3=new Checkbox("Male",cbg1,false);
  cb3.setBounds(150,180,60,60);
  add(cb3);

  cb4=new Checkbox("Female",cbg1,true);
  cb4.setBounds(210,180,60,60);
  add(cb4);

  b1=new Button("Submit");
  b1.setBounds(150,240,100,35);
  b1.addActionListener(this);
  add(b1);

  area=new TextArea(200,100);
  area.setBounds(30,280,200,100);
  add(area);
 }

  public void actionPerformed(ActionEvent ae){
	String name=t1.getText();
	String course="";
	String gender="";
  StringBuilder sb=new StringBuilder();
   if(ae.getSource() == b1){
	 if(cb1.getState() == true){
		course="C++";
	}
   else if(cb2.getState() == true){
		course="Java";
	}
   if(cb3.getState() == true){
	    gender="Male";
	}
   else if(cb4.getState() == true){
	   gender="Female";
	}
   }
   sb.append("Name: "+name+"\n"+"Course: "+course+"\n"+"Gender: "+gender);
   area.setText(sb.toString());
  }
 public static void main(String args[]){
 CheckboxGroupEx7 cbg=new CheckboxGroupEx7();
}
}
