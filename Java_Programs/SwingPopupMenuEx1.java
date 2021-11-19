//1.Java Swing PopupMenu Example.
import javax.swing.*;
import java.awt.event.*;
public class SwingPopupMenuEx1{
 SwingPopupMenuEx1(){
  JFrame f=new JFrame("Swing PopupMenu");
  JPopupMenu popupmenu =new JPopupMenu("Edit");

  JMenuItem cut=new JMenuItem("Cut");
  cut.setActionCommand("Cut");

  JMenuItem copy=new JMenuItem("Copy");
  copy.setActionCommand("Copy");

  JMenuItem paste=new JMenuItem("Paste");
  paste.setActionCommand("Paste");

  popupmenu.add(cut);
  popupmenu.add(copy);
  popupmenu.add(paste);

  f.addMouseListener(new MouseAdapter(){
	  public void mouseClicked(MouseEvent me){
		 popupmenu.show(f, me.getX(), me.getY());
	  }
	});
	f.add(popupmenu);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
  }
  public static void main(String args[]){
	 SwingPopupMenuEx1 sp=new SwingPopupMenuEx1();
  }
}