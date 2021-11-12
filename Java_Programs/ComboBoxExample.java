//2.Java JComboBox Example with ActionListener.
import javax.swing.*;
import java.awt.event.*;
public class ComboBoxExample{
 JFrame f;
 public ComboBoxExample(){
 f=new JFrame("ComboBox Example");
 f.setSize(400,400);
 f.setVisible(true);
 f.setLayout(null);

 JLabel l1=new JLabel();
 l1.setHorizontalAlignment(JLabel.CENTER);
 l1.setSize(300,100);
 f.add(l1);

 JButton b1=new JButton("Show");
 b1.setBounds(150,250,100,35);
 String languages[]={"C","C++","C#","Java","PHP"};
 f.add(b1);

 JComboBox cb=new JComboBox(languages);
 cb.setBounds(150,100,70,30);
 f.add(cb);

 b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
   String data="Programming language Selected: "+cb.getItemAt(cb.getSelectedIndex());
   l1.setText(data);
  }
 });
 }
 public static void main(String args[]){
 ComboBoxExample cb=new ComboBoxExample();
 }
}
