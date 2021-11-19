//1.Java Awt MenuItem and Menu Example.
import java.awt.*;
public class AwtMenuExample1{
 AwtMenuExample1(){
  Frame f=new Frame("MenuItem and Menu Example");
  MenuBar mb=new MenuBar();
  Menu menu=new Menu("Menu");
  Menu submenu=new Menu("Sub Menu");
  
  MenuItem i1=new MenuItem("Item 1");
  MenuItem i2=new MenuItem("Item 2");
  MenuItem i3=new MenuItem("Item 3");
  MenuItem i4=new MenuItem("Item 4");
  MenuItem i5=new MenuItem("Item 5");
  
  menu.add(i1);
  menu.add(i2);
  menu.add(i3);
  submenu.add(i4);
  submenu.add(i5);
  
  menu.add(submenu);
  mb.add(menu);
  
  f.setMenuBar(mb);
  f.setSize(400,400);
  f.setLayout(null);
  f.setVisible(true);
 }
  public static void main(String args[]){
  AwtMenuExample1 menu=new AwtMenuExample1();
}
}