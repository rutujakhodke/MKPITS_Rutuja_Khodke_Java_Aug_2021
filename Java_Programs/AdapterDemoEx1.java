//2.Java Awt Event handling Example of Mouse Event With adapter class.
import java.awt.*;
import java.awt.event.*;
public class AdapterDemoEx1 extends Frame{
 public AdapterDemoEx1(){
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  setTitle("Mouse Event Ex");

  addMouseListener(new MyMouseAdapter(this));
  addMouseMotionListener(new MyMouseMotionAdapter(this));
 }
 public static void main(String args[]){
  AdapterDemoEx1 ad=new AdapterDemoEx1();
 }
}

class MyMouseAdapter extends MouseAdapter{
  AdapterDemoEx1 adapter;
  public MyMouseAdapter(AdapterDemoEx1 adapter){
	 this.adapter=adapter;
  }
  //handle mouse clicked event
  public void mouseClicked(MouseEvent me){
  System.out.println("Mouse clicked " + me.getX() +","+ me.getY());
  }
 }

 class MyMouseMotionAdapter extends MouseMotionAdapter{
	AdapterDemoEx1 adapter;
	public MyMouseMotionAdapter(AdapterDemoEx1 adapter){
		this.adapter=adapter;
   }
	 //handle mouse dragged event
  public void mouseDragged(MouseEvent me){
	 System.out.println("Mouse Dragged");
	}
 }