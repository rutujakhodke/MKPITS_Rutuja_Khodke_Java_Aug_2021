//1.Java Awt PopupMenu Example.
import java.awt.*;
import java.awt.event.*;
public class PopupMenuEx{
 PopupMenuEx(){
   Frame f=new Frame("PopupMenu Example");
   final PopupMenu popupmenu =new PopupMenu("Edit");
   MenuItem cut=new MenuItem("Cut");
   cut.setActionCommand("Cut");

   MenuItem copy=new MenuItem("Copy");
   copy.setActionCommand("Copy");

   MenuItem paste=new MenuItem("Paste");
   paste.setActionCommand("Paste");

   popupmenu.add(cut);
   popupmenu.add(copy);
   popupmenu.add(paste);

   f.addMouseListener(new MouseAdapter(){
	 public void mouseClicked(MouseEvent me){
	  popupmenu.show(f ,me.getX(), me.getY());
	 }
	});
   f.add(popupmenu);
   f.setSize(400,400);
   f.setVisible(true);
   f.setLayout(null);
  }
  public static void main(String args[]){
   PopupMenuEx popupmenu=new PopupMenuEx();
  }
}