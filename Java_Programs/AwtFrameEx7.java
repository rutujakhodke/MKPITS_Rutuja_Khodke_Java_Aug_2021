//7.Java AWT example.Create a Calculator.(by extending Frame class i.e. Inheritance).
import java.awt.*;
class AwtFrameEx7 extends Frame{
 public AwtFrameEx7(){
  setSize(500,500);
  setVisible(true);

  setLayout(null);
  setTitle("Calculator");

  //creating textfield for calculation
  TextField t1=new TextField();
  t1.setBounds(50,50,390,45);
  add(t1);

  //creating buttons in calculator
  Button b1=new Button("1");
  b1.setBounds(80,110,100,55);
  add(b1);

  Button b2=new Button("2");
  b2.setBounds(190,110,100,55);
  add(b2);

  Button b3=new Button("3");
  b3.setBounds(300,110,100,55);
  add(b3);

  Button b4=new Button("4");
  b4.setBounds(80,175,100,55);
  add(b4);

  Button b5=new Button("5");
  b5.setBounds(190,175,100,55);
  add(b5);

  Button b6=new Button("6");
  b6.setBounds(300,175,100,55);
  add(b6);

  Button b7=new Button("7");
  b7.setBounds(80,240,100,55);
  add(b7);

  Button b8=new Button("8");
  b8.setBounds(190,240,100,55);
  add(b8);

  Button b9=new Button("9");
  b9.setBounds(300,240,100,55);
  add(b9);

  Button b10=new Button("+");
  b10.setBounds(80,306,100,55);
  add(b10);

  Button b11=new Button("0");
  b11.setBounds(190,306,100,55);
  add(b11);

  Button b12=new Button("-");
  b12.setBounds(300,306,100,55);
  add(b12);

  Button b13=new Button("C");
  b13.setBounds(80,372,100,55);
  add(b13);

  Button b14=new Button("*");
  b14.setBounds(190,372,100,55);
  add(b14);

  Button b15=new Button("=");
  b15.setBounds(300,372,100,55);
  add(b15);
  }
   public static void main(String args[]){
   AwtFrameEx7 f=new AwtFrameEx7();
 }
}