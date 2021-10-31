//8.Java Awt event example.Wap to accept a number and print table of that number.
import java.awt.*;
import java.awt.event.*;
class AwtEventEx8 extends Frame implements ActionListener{
 Label l1;
 TextField t1;
 TextArea area;
 Button b1;
 public AwtEventEx8(){
  setSize(400,400);
  setVisible(true);
  setLayout(null);
  setTitle("Multiplication Table");

  l1=new Label("Enter a Number:");
  l1.setBounds(40,100,100,35);
  add(l1);
  t1=new TextField();
  t1.setBounds(160,100,90,30);
  add(t1);

  b1=new Button("Result");
  b1.setBounds(150,180,100,35);
  b1.addActionListener(this);
  add(b1);

  //creating textarea for multiplication table of a number
  area=new TextArea(40,40);//textarea(int row,int column)
  area.setBounds(40,250,100,110);
  add(area);
  }
 public void actionPerformed(ActionEvent ae){
 int num=Integer.parseInt(t1.getText());
 StringBuilder sb=new StringBuilder();
  int res=1;
  if(ae.getSource() == b1){
   for(int i=0;i<=10;i++){
     res=num*i;
   sb.append(num+" * "+i+" = "+res+"\n");
   }
   area.setText(sb.toString());
  }
 }
  public static void main(String args[]){
  AwtEventEx8 e=new AwtEventEx8();
 }
}