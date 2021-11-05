//8.Java JCheckbox Example with ItemListener.
import javax.swing.*;
import java.awt.event.*;
public class SwingCheckBoxEx8{
 public SwingCheckBoxEx8(){
 JFrame f=new JFrame("Checkbox Example");
 f.setSize(400,400);
 f.setVisible(true);
 f.setLayout(null);

 JLabel l1=new JLabel();
 l1.setHorizontalAlignment(JLabel.CENTER);
 l1.setSize(400,100);
 f.add(l1);

 JCheckBox cb1=new JCheckBox("C++");
 cb1.setBounds(150,100,70,70);
 f.add(cb1);

 JCheckBox cb2=new JCheckBox("Java");
 cb2.setBounds(150,150,70,70);
 f.add(cb2);

 cb1.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent ie){
  l1.setText("C++  CheckBox: "+(ie.getStateChange() == 1?"Checked":"Unchecked"));
  }
 });
 cb2.addItemListener(new ItemListener(){
  public void itemStateChanged(ItemEvent ie){
  l1.setText("Java  CheckBox: "+(ie.getStateChange() == 1?"Checked":"Unchecked"));
  }
 });
 }
  public static void main(String args[]){
  SwingCheckBoxEx8 cb=new SwingCheckBoxEx8();
 }
}