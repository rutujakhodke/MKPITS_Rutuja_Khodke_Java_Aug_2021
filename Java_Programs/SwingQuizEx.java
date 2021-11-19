//2.Java Swing Example of Quiz.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingQuizEx extends Frame{
 JLabel l1,l2,l3,l4,l5,l6;
 JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10;
 JButton b1;

 public SwingQuizEx(){
	 setSize(600,600);
	 setVisible(true);
	 setLayout(null);
     setTitle("Quiz Example");

  l1=new JLabel("1.The Capital of India is_____ ");
  l1.setBounds(50,50,200,35);
  add(l1);

  rb1=new JRadioButton("Delhi");
  rb1.setBounds(50,90,100,35);
  add(rb1);

  rb2=new JRadioButton("Mumbai");
  rb2.setBounds(190,90,100,35);
  add(rb2);

  ButtonGroup bg1=new ButtonGroup();
  bg1.add(rb1);
  bg1.add(rb2);

  l2=new JLabel("2.The Capital of Maharashtra is_____");
  l2.setBounds(50,130,220,35);
  add(l2);

  rb3=new JRadioButton("Nagpur");
  rb3.setBounds(50,170,100,35);
  add(rb3);

  rb4=new JRadioButton("Mumbai");
  rb4.setBounds(190,170,100,35);
  add(rb4);

  ButtonGroup bg2=new ButtonGroup();
  bg2.add(rb3);
  bg2.add(rb4);

  l3=new JLabel("3.Who won the Gold Medal in Olympics for India?");
  l3.setBounds(50,210,290,35);
  add(l3);

  rb5=new JRadioButton("Neeraj Chopra");
  rb5.setBounds(50,250,130,35);
  add(rb5);

  rb6=new JRadioButton("Bajrang Punia");
  rb6.setBounds(190,250,130,35);
  add(rb6);

  ButtonGroup bg3=new ButtonGroup();
  bg3.add(rb5);
  bg3.add(rb6);

  l4=new JLabel("4.Who was the First Women President of India?");
  l4.setBounds(50,290,270,35);
  add(l4);

  rb7=new JRadioButton("Indira Gandhi");
  rb7.setBounds(50,330,130,35);
  add(rb7);

  rb8=new JRadioButton("Pratibha Patil");
  rb8.setBounds(190,330,130,35);
  add(rb8);

  ButtonGroup bg4=new ButtonGroup();
  bg4.add(rb7);
  bg4.add(rb8);

  l5=new JLabel("5.What is the National Animal of India?");
  l5.setBounds(50,370,270,35);
  add(l5);

  rb9=new JRadioButton("Tiger");
  rb9.setBounds(50,410,100,35);
  add(rb9);

  rb10=new JRadioButton("Lion");
  rb10.setBounds(190,410,100,35);
  add(rb10);

  ButtonGroup bg5=new ButtonGroup();
  bg5.add(rb9);
  bg5.add(rb10);

  b1=new JButton("Click Me");
  b1.setBounds(230,480,100,35);
  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    int total=0;
    if(rb1.isSelected() == true){
	   //"Delhi";
     total=total+1;
    }
    if(rb4.isSelected() == true){
     total=total+1;
    }
    if(rb5.isSelected() == true){
	  total=total+1;
	}
	if(rb8.isSelected() == true){
	  total=total+1;
	}
	if(rb9.isSelected() == true){
	  total=total+1;
	}
   l6.setText("Score out of 5 is: "+total);
   }
  });
  add(b1);

  l6=new JLabel("Result:");
  l6.setBounds(50,510,160,35);
  add(l6);
  }
  public static void main(String args[]){
	SwingQuizEx sw=new SwingQuizEx();
 }
}
