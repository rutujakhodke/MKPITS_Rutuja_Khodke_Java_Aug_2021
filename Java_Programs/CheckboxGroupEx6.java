//2.Java Awt CheckboxGroup Example with ItemListener.
import java.awt.*;
import java.awt.event.*;
public class CheckboxGroupEx6{
 public CheckboxGroupEx6(){
  Frame f=new Frame("CheckboxGroup Example");
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);

  Label l1=new Label();
  l1.setAlignment(Label.CENTER);
  l1.setSize(300,100);
  f.add(l1);

  CheckboxGroup cbg=new CheckboxGroup();
  Checkbox cb1=new Checkbox("C++",cbg,false);
  cb1.setBounds(150,80,70,70);
  f.add(cb1);

  Checkbox cb2=new Checkbox("Java",cbg,false);
  cb2.setBounds(150,120,70,70);
  f.add(cb2);

  cb1.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent ie){
    l1.setText("C++ Checkbox: Checked");
   }
  });
  cb2.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent ie){
    l1.setText("Java Checkbox: Checked");
   }
  });
 }
 public static void main(String args[]){
 CheckboxGroupEx6 cbg1=new CheckboxGroupEx6();
  }
}
