//4.Java Awt CheckboxGroup example.Create a Registration Form.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroupEx4 extends Frame implements ActionListener{
 Label l1,l2,l3;
 TextField t1;
 CheckboxGroup cbg1;
 Checkbox cb1,cb2,cb3,cb4;
 Button b1;
 TextArea area;
 public CheckboxGroupEx4(){
  setSize(600,600);
  setVisible(true);
  setLayout(null);
  setTitle("Registration Form");

  l1=new Label("UserName:-");
  l1.setBounds(30,50,90,35);
  add(l1);
  t1=new TextField();
  t1.setBounds(160,50,170,30);
  add(t1);

  l2=new Label("Gender:-");
  l2.setBounds(30,120,90,35);
  add(l2);
  cbg1=new CheckboxGroup();
  cb1=new Checkbox("Male",cbg1,false);
  cb1.setBounds(160,120,60,60);
  add(cb1);

  cb2=new Checkbox("Female",cbg1,true);
  cb2.setBounds(250,120,60,60);
  add(cb2);

  l3=new Label("Hobby:-");
  l3.setBounds(30,180,100,35);
  add(l3);

  cb3=new Checkbox("Music",true);
  cb3.setBounds(160,180,60,60);
  add(cb3);

  cb4=new Checkbox("Cricket");
  cb4.setBounds(250,180,60,60);
  add(cb4);

  b1=new Button("Submit");
  b1.setBounds(200,280,100,35);
  add(b1);
  b1.addActionListener(this);

  area=new TextArea(200,100);
  area.setBounds(20,330,500,200);
  add(area);
  }
  public void actionPerformed(ActionEvent ae){
	String name=t1.getText();
	String gender="";
	String hobby="";
 StringBuilder sb=new StringBuilder();
  if(ae.getSource() == b1){
   if(cb1.getState() == true){
	   gender="Male";
	}
   else if(cb2.getState() == true){
	  gender="Female";
	}
   if(cb3.getState() == true){
	  hobby="Music";
	}
   else if(cb4.getState() == true){
	 hobby="Cricket";
	}
  }
  sb.append("UserName: "+name+"\n"+"Gender: "+gender+"\n"+"Hobby: "+hobby);
  area.setText(sb.toString());
  }
 public static void main(String args[]){
 CheckboxGroupEx4 cbg=new CheckboxGroupEx4();
 }
}