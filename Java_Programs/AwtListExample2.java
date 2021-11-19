//2.Java Awt List example with ActionListener.
import java.awt.*;
import java.awt.event.*;
public class AwtListExample2{
 AwtListExample2(){
  Frame f=new Frame("List Example");
  f.setSize(500,400);
  f.setVisible(true);
  f.setLayout(null);
  Label l1=new Label();
  l1.setAlignment(Label.CENTER);
  l1.setSize(500,100);
  f.add(l1);

  List list1=new List(4,false);
  list1.add("C");
  list1.add("C++");
  list1.add("Java");
  list1.add("PHP");

  list1.setBounds(100,100,70,70);
  f.add(list1);

  List list2=new List(4,true);
  list2.add("Turbo C++");
  list2.add("Spring");
  list2.add("Hibernate");
  list2.add("CodeIgnitor");

  list2.setBounds(100,200,70,70);
  f.add(list2);

  Button b1=new Button("Show");
  b1.setBounds(200,160,100,35);
  b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	 String data="Programming language selected: " +list1.getItem(list1.getSelectedIndex());
	 data+=", FrameWork Selected: ";
	 for(String frame:list2.getSelectedItems()){
		  data+=frame+" ";
		}
	  l1.setText(data);
	}
  });
  f.add(b1);
 }
 public static void main(String args[]){
   AwtListExample2 list=new AwtListExample2();
 }
}
