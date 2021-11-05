//1.Java Awt Event handling Example of Mouse Event Without adapter class.
import java.awt.*;
import java.awt.event.*;
class MouseEventEx1 extends Frame implements MouseListener,MouseMotionListener{
  TextField t1;
  public MouseEventEx1(){
   setSize(400,400);
   setVisible(true);
   setLayout(null);
   setTitle("Mouse Event Ex");
   t1=new TextField();
   t1.setBounds(40,50,250,35);
   add(t1);

   addMouseListener(this);
   addMouseMotionListener(this);
  }
   public void mousePressed(MouseEvent me){
    t1.setText("Left mouse button down at " + me.getX()+ "," + me.getY());
   }

   public void mouseReleased(MouseEvent me){
	 t1.setText("Mouse button went up");
   }

   public void mouseExited(MouseEvent me){
	 t1.setText("Mouse Exited");
	}

   public void mouseEntered(MouseEvent me){
	 t1.setText("Mouse Entered");
	}

   public void mouseDragged(MouseEvent me){
	 t1.setText("Mouse Dragged");
	}

	public void mouseMoved(MouseEvent me){
	 t1.setText("Mouse was moved");
	}

	public void mouseClicked(MouseEvent me){
	 t1.setText("Mouse clicked");
	}

 public static void main(String args[]){
 MouseEventEx1 m=new MouseEventEx1();
 }
}