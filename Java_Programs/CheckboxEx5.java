//1.Java Awt Checkbox Example with ItemListener.
import java.awt.*;
import java.awt.event.*;
public class CheckboxEx5{
 public CheckboxEx5(){
  Frame f=new Frame("Checkbox Example");
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);

  Label l1=new Label();
  l1.setAlignment(Label.CENTER);
  l1.setSize(400,100);
  f.add(l1);

  Checkbox cb1=new Checkbox("C++");
  cb1.setBounds(150,80,70,70);
  f.add(cb1);

  Checkbox cb2=new Checkbox("Java");
  cb2.setBounds(150,120,70,70);
  f.add(cb2);

  cb1.addItemListener(new ItemListener(){
   public void itemStateChanged(ItemEvent ie){
   l1.setText("C++ Checkbox: " +(ie.getStateChange() == 1?"Checked":"Unchecked"));
   }
  });
  cb2.addItemListener(new ItemListener(){
	public void itemStateChanged(ItemEvent ie){
	 l1.setText("Java Checkbox: "+(ie.getStateChange() == 1?"Checked":"Unchecked"));
   }
  });
 }
 public static void main(String args[]){
 CheckboxEx5 cb=new CheckboxEx5();
 }
}