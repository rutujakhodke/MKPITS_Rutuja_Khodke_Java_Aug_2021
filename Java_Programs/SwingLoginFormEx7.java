//7.Java JPasswordField Example with ActionListener.Login Form.
import javax.swing.*;
import java.awt.event.*;
public class SwingLoginFormEx7 extends JFrame{
 JLabel l1,l2,l3;
 JTextField t1;
 JButton b1;
 JPasswordField p1;
 public SwingLoginFormEx7(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Swing Login Form");

  l1=new JLabel("Username:- ");
  l1.setBounds(30,50,100,35);
  add(l1);
  t1=new JTextField();
  t1.setBounds(150,50,150,35);
  add(t1);

  l2=new JLabel("Password:- ");
  l2.setBounds(30,90,100,35);
  add(l2);

  p1=new JPasswordField();
  p1.setBounds(150,90,150,35);
  add(p1);

  b1=new JButton("Login");
  b1.setBounds(140,150,100,35);

  l3=new JLabel("Status:");
  l3.setBounds(30,190,200,35);
  add(l3);

  b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	 if(t1.getText().equals("admin") && p1.getText().equals("admin123")){
		l3.setText("Login Successful!!");
	}
	else{
		l3.setText("Invalid Credentials!!");
	}
   }
  });
  add(b1);
 }
  public static void main(String args[]){
  SwingLoginFormEx7 sw=new SwingLoginFormEx7();
}
}