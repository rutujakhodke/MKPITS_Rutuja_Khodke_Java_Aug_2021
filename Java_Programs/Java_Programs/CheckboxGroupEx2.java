//2.Java Awt CheckboxGroup example.Example of Quiz.
import java.awt.*;
import java.awt.event.*;
class CheckboxGroupEx2 extends Frame{
 Label l1,l2,l3,l4,l5,l6;
 Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10;
 CheckboxGroup cbg1,cbg2,cbg3,cbg4,cbg5;
 Button b1;

 public CheckboxGroupEx2(){
	 setSize(600,700);
	 setVisible(true);
	 setLayout(null);
     setTitle("Quiz Example");

  l1=new Label("1.The Capital of India is_____ ");
  l1.setBounds(50,50,200,35);
  add(l1);

  cbg1=new CheckboxGroup();
  cb1=new Checkbox("Delhi",cbg1,true);
  cb1.setBounds(50,70,70,70);
  add(cb1);

  cb2=new Checkbox("Mumbai",cbg1,false);
  cb2.setBounds(190,70,70,70);
  add(cb2);

  l2=new Label("2.The Capital of Maharashtra is_____");
  l2.setBounds(50,130,200,35);
  add(l2);

  cbg2=new CheckboxGroup();
  cb3=new Checkbox("Nagpur",cbg2,false);
  cb3.setBounds(50,150,70,70);
  add(cb3);

  cb4=new Checkbox("Mumbai",cbg2,true);
  cb4.setBounds(190,150,70,70);
  add(cb4);

  l3=new Label("3.Who won the Gold Medal in Olympics for India?");
  l3.setBounds(50,210,270,35);
  add(l3);

  cbg3=new CheckboxGroup();
  cb5=new Checkbox("Neeraj Chopra",cbg3,true);
  cb5.setBounds(50,220,100,100);
  add(cb5);

  cb6=new Checkbox("Bajrang Punia",cbg3,false);
  cb6.setBounds(190,220,100,100);
  add(cb6);

  l4=new Label("4.Who was the First Women President of India?");
  l4.setBounds(50,310,270,35);
  add(l4);

  cbg4=new CheckboxGroup();
  cb7=new Checkbox("Indira Gandhi",cbg4,false);
  cb7.setBounds(50,320,100,100);
  add(cb7);

  cb8=new Checkbox("Pratibha Patil",cbg4,true);
  cb8.setBounds(190,320,100,100);
  add(cb8);

  l5=new Label("5.What is the National Animal of India?");
  l5.setBounds(50,410,270,35);
  add(l5);

  cbg5=new CheckboxGroup();
  cb9=new Checkbox("Tiger",cbg5,true);
  cb9.setBounds(50,430,80,80);
  add(cb9);

  cb10=new Checkbox("Lion",cbg5,false);
  cb10.setBounds(190,430,80,80);
  add(cb10);


  b1=new Button("Click Me");
  b1.setBounds(250,510,100,35);
  b1.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    int total=0;
    if(cb1.getState() == true){
     total=total+1;
    }
    if(cb4.getState() == true){
     total=total+1;
    }
    if(cb5.getState() == true){
	  total=total+1;
	}
	if(cb8.getState() == true){
	  total=total+1;
	}
	if(cb9.getState() == true){
	  total=total+1;
	}
   l6.setText("Score out of 5 is: "+total);
   }
  });
  add(b1);

  l6=new Label("Result:");
  l6.setBounds(50,570,160,35);
  add(l6);
  }
  public static void main(String args[]){
  CheckboxGroupEx2 cbg=new CheckboxGroupEx2();
 }
}
