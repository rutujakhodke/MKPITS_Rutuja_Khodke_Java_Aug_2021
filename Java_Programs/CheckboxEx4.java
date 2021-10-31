//3.Java awt CheckBox example.Example of checkbox to do addition and substraction of 2 no.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class CheckboxEx4{
 TextField t1,t2;
 Label l1,l2;
 Button b1;
 CheckboxEx4(){
Frame f=new Frame("Checkbox Example");
 f.setSize(400,400);
 f.setVisible(true);
 f.setLayout(null);

 t1=new TextField();
 t1.setBounds(20,60,100,35);
 f.add(t1);

 t2=new TextField();
 t2.setBounds(140,60,100,35);
 f.add(t2);

 Checkbox cb1=new Checkbox("Add");
 cb1.setBounds(150,120,50,50);
 f.add(cb1);

 Checkbox cb2=new Checkbox("Substract", true);
 cb2.setBounds(150,150,90,90);
 f.add(cb2);

 l1=new Label();
 l1.setBounds(130,240,200,35);
 f.add(l1);

 l2=new Label();
 l2.setBounds(130,290,200,35);
 f.add(l2);

 b1=new Button("Result");
 b1.setBounds(150,330,100,35);
 b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
	 l1.setText("");
	 l2.setText("");
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
   int res=0;
  StringBuilder sb=new StringBuilder();
   if(cb1.getState() == true){
	  res=n1+n2;
	  sb.append("Addition is: "+res);
	}
   if(cb2.getState() == true){
	  res=n1-n2;
	  sb.append(" Substraction is: "+res);
	}
   l1.setText(sb.toString());
   }
  });
  f.add(b1);
 }
 public static void main(String args[]){
 CheckboxEx4 cb=new CheckboxEx4();
  }
}
