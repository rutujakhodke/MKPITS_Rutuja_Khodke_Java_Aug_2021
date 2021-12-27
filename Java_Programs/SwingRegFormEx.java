//1.Registration Form using Swing.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingRegFormEx extends JFrame implements ActionListener{
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
  JTextField t1;
  JButton b1;
  JCheckBox cb1,cb2;
  JRadioButton rb1,rb2;
  ButtonGroup bg;
  JComboBox cb;
  public SwingRegFormEx(){
	setSize(500,600);
	setVisible(true);
	setLayout(null);
	setTitle("Registration Form");

	l1=new JLabel("Registration Form");
	l1.setBounds(150,50,140,35);
	add(l1);

	l2=new JLabel("UserName: ");
	l2.setBounds(50,120,100,35);
	add(l2);
	t1=new JTextField();
	t1.setBounds(160,120,150,30);
	add(t1);

	l3=new JLabel("Hobby: ");
	l3.setBounds(50,170,100,35);
	add(l3);

	cb1=new JCheckBox("Music");
	cb1.setBounds(130,170,100,35);
	add(cb1);

	cb2=new JCheckBox("Dance");
	cb2.setBounds(250,170,100,35);
	add(cb2);

	l4=new JLabel("Gender: ");
	l4.setBounds(50,220,100,35);
	add(l4);

	rb1=new JRadioButton("Male");
	rb1.setBounds(130,220,100,35);
	add(rb1);

	rb2=new JRadioButton("Female");
	rb2.setBounds(250,220,100,35);
	add(rb2);

	bg=new ButtonGroup();
	bg.add(rb1);
	bg.add(rb2);

	l5=new JLabel("City: ");
	l5.setBounds(50,270,100,35);
	add(l5);
	String city[]={"Nagpur","Mumbai","Pune","Hyderabad","Dhule"};

	cb=new JComboBox(city);
	cb.setBounds(200,270,90,30);
	add(cb);

	b1=new JButton("Register");
	b1.setBounds(180,340,100,35);
	b1.addActionListener(this);
	add(b1);

	l6=new JLabel("Username: ");
	l6.setBounds(50,390,190,35);
	add(l6);

    l7=new JLabel("Hobby: ");
    l7.setBounds(50,420,140,35);
    add(l7);

    l8=new JLabel("Gender: ");
    l8.setBounds(50,450,140,35);
    add(l8);

    l9=new JLabel("City: ");
    l9.setBounds(50,480,140,35);
    add(l9);

  }
  public void actionPerformed(ActionEvent ae){
	l6.setText("Username: " +t1.getText());
	StringBuilder sb=new StringBuilder();
	 sb.append("Hobby: ");
	 if(cb1.isSelected() == true){
	   sb.append(" Music ");
	}
	if(cb2.isSelected() == true){
		sb.append(" Dance ");
	}
	l7.setText(sb.toString());

    StringBuilder sb1=new StringBuilder();
     sb1.append("Gender: ");
     if(rb1.isSelected() == true){
	   sb1.append(" Male ");
	}
	if(rb2.isSelected() == true){
	   sb1.append(" Female ");
	}
	l8.setText(sb1.toString());

	 l9.setText("City: " + cb.getItemAt(cb.getSelectedIndex()));
	  StringBuilder sb2=new StringBuilder();
      sb2.append("Username: "+ t1.getText() +"\n");
      sb2.append(sb.toString() +"\n");
      sb2.append(sb1.toString() +"\n");
     JOptionPane.showMessageDialog(this,sb2.toString());
  }
  public static void main(String args[]){
	SwingRegFormEx sw=new SwingRegFormEx();
   }
 }
