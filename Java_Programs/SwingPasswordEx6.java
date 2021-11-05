//6.Java JPasswordField Example with ActionListener.
import javax.swing.*;
import java.awt.event.*;
public class SwingPasswordEx6{
 public static void main(String args[]){
 JLabel l1,l2,l3;
 JTextField t1;
 JButton b1;
 JPasswordField p1;
 JFrame f=new JFrame("Swing Password Ex");
 f.setSize(400,400);
 f.setVisible(true);
 f.setLayout(null);

 l1=new JLabel("UserName:- ");
 l1.setBounds(30,50,100,35);
 f.add(l1);
 t1=new JTextField();
 t1.setBounds(150,50,130,30);
 f.add(t1);

 l2=new JLabel("Password:- ");
 l2.setBounds(30,90,70,30);
 f.add(l2);

 p1=new JPasswordField();
 p1.setBounds(150,90,130,30);
 f.add(p1);

 b1=new JButton("Login");
 b1.setBounds(150,140,100,35);

 l3=new JLabel();
 l3.setBounds(30,190,300,35);
 f.add(l3);

 b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent ae){
	String data="Username: "+t1.getText();
	data+=",Password: "+new String(p1.getPassword());
	l3.setText(data);
  }
 });
 f.add(b1);

 }
}