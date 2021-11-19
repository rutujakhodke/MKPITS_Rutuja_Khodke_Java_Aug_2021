//1.Java Swing JMenuItem and JMenu Example.
import javax.swing.*;
public class SwingMenuExample1{
   SwingMenuExample1(){
	  JFrame f=new JFrame("JMenuItem and Menu Example");
	  JMenuBar mb=new JMenuBar();
	  JMenu menu=new JMenu("menu");
	  JMenu submenu=new JMenu("Sub Menu");

	  JMenuItem i1=new JMenuItem("Item 1");
	  JMenuItem i2=new JMenuItem("Item 2");
	  JMenuItem i3=new JMenuItem("Item 3");
	  JMenuItem i4=new JMenuItem("Item 4");
	  JMenuItem i5=new JMenuItem("Item 5");

	  menu.add(i1);
	  menu.add(i2);
	  menu.add(i3);
	  submenu.add(i4);
	  submenu.add(i5);

      menu.add(submenu);
      mb.add(menu);

      f.setJMenuBar(mb);
      f.setSize(400,400);
      f.setVisible(true);
      f.setLayout(null);
	}
	public static void main(String args[]){
	 SwingMenuExample1 smenu=new SwingMenuExample1();
	}
 }