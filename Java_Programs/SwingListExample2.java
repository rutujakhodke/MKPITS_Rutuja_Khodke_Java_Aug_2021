//3.Java Swing List example with ActionListener.
import javax.swing.*;
import java.awt.event.*;
public class SwingListExample2{
 SwingListExample2(){
  JFrame f=new JFrame("Swing List Ex");
  f.setSize(700,400);
  f.setVisible(true);
  f.setLayout(null);
  JLabel l1=new JLabel();
  l1.setSize(600,100);
  f.add(l1);

  DefaultListModel<String> list1=new DefaultListModel<>();
  list1.addElement("C");
  list1.addElement("C++");
  list1.addElement("Java");
  list1.addElement("PHP");

  JList<String> li1=new JList<>(list1);
  li1.setBounds(100,100,70,70);
  f.add(li1);

  DefaultListModel<String> list2=new DefaultListModel<>();
  list2.addElement("Turbo C++");
  list2.addElement("Structs");
  list2.addElement("Spring");
  list2.addElement("Hibernate");

  JList<String> li2=new JList<>(list2);
  li2.setBounds(100,200,70,70);
  f.add(li2);

  JButton b1=new JButton("Show");
  b1.setBounds(200,150,100,35);
  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    String data="";
    if(li1.getSelectedIndex()!= -1){
     data="Programming language selected: " +li1.getSelectedValue();
     l1.setText(data);
    }
    if(li2.getSelectedIndex()!= -1){
     data+=", Framework selected: ";
     for(Object frame:li2.getSelectedValues()){
      data+=frame+" ";
     }
    }
    l1.setText(data);
   }
  });
  f.add(b1);
 }
 public static void main(String args[]){
   SwingListExample2 list=new SwingListExample2();
 }
}

