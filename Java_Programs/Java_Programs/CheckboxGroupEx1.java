//1.Java Awt CheckboxGroup example.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroupEx1 extends Frame{
 Label l1,l2;
 CheckboxGroup cbg1;
 Checkbox cb1,cb2;
 Button b1;
 public CheckboxGroupEx1(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("CheckboxGroup");
  l1=new Label("Select a Gender:-");
  l1.setBounds(50,50,100,35);
  add(l1);

  //creating CheckboxGroup
  cbg1=new CheckboxGroup();
  //creating checkbox
  cb1=new Checkbox("Male",cbg1,false);
  cb1.setBounds(100,70,80,80);
  add(cb1);

  cb2=new Checkbox("Female",cbg1,true);
  cb2.setBounds(100,120,70,70);
  add(cb2);

  b1=new Button("Click Me");
  b1.setBounds(100,190,100,35);
  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    if(cb1.getState() == true){
     l2.setText("Gender selected: Male");
    }
   else if(cb2.getState() == true){
    l2.setText("Gender selected: Female");
   }
   }
  });
  add(b1);

  l2=new Label("Gender");
  l2.setBounds(50,230,170,35);
  add(l2);
 }
 public static void main(String args[]){
  CheckboxGroupEx1 cbg=new CheckboxGroupEx1();
 }
}