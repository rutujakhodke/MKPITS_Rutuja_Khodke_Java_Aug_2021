//1.Java Swing List example.
import javax.swing.*;
public class SwingListExample1{
 SwingListExample1(){
  JFrame f=new JFrame("Swing List Ex");
  DefaultListModel<String> l1=new DefaultListModel<>();
  l1.addElement("C");
  l1.addElement("C++");
  l1.addElement("Java");
  l1.addElement("PHP");
  l1.addElement("SQL");
  JList<String> list=new JList<>(l1);
  list.setBounds(100,100,75,75);
  f.add(list);
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);
 }
 public static void main(String args[]){
   SwingListExample1 list=new SwingListExample1();
 }
}

