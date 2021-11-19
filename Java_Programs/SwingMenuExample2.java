//2.Java Swing JMenuItem and JMenu Example.
import javax.swing.*;
public class SwingMenuExample2{
 SwingMenuExample2(){
  JFrame f=new JFrame("JMenuItem and JMenu Example");
  JMenuBar mb=new JMenuBar();
  JMenu menu=new JMenu("File");
  JMenu submenu=new JMenu("Project");
  JMenuItem i1=new JMenuItem("New");
  JMenuItem i2=new JMenuItem("Open");
  JMenuItem i3=new JMenuItem("Close");
  JMenuItem i4=new JMenuItem("Rename");
  JMenuItem i5=new JMenuItem("Delete");

  menu.add(i1);
  menu.add(i2);
  menu.add(i3);
  submenu.add(i4);
  submenu.add(i5);

  menu.add(submenu);
  mb.add(menu);

  JMenu menu1=new JMenu("Edit");
  JMenuItem i11=new JMenuItem("Cut");
  JMenuItem i22=new JMenuItem("Copy");
  JMenuItem i33=new JMenuItem("Paste");

  menu1.add(i11);
  menu1.add(i22);
  menu1.add(i33);

  mb.add(menu1);

  f.setJMenuBar(mb);
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);
 }
  public static void main(String args[]){
  SwingMenuExample2 smenu=new SwingMenuExample2();
}
}