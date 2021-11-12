//7.Java Swing Example.Create a Calculator (by extending Frame class i.e. Inheritance).
import javax.swing.*;
import java.awt.event.*;
class SwingCalculatorEx extends JFrame{
	double num1,pnum=0;//pnum-previous number
	double res=0;
	String op=null;
 public SwingCalculatorEx(){
  setSize(540,600);
  setVisible(true);

  setLayout(null);
  setTitle("Calculator");

  //creating textfield for calculation
  JTextField t1=new JTextField();
  t1.setBounds(50,50,390,45);
  add(t1);

  //creating buttons in calculator
  JButton b1=new JButton("1");
  b1.setBounds(80,110,100,55);
  b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	  if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
		 t1.setText("1");
	 }
	 else{
		 t1.setText(t1.getText()+ "1");
	 }
	}
  });
  add(b1);

  JButton b2=new JButton("2");
  b2.setBounds(190,110,100,55);
  b2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	 if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("*") || t1.getText().equals("/")){
		 t1.setText("2");
	 }
	 else{
		 t1.setText(t1.getText()+ "2");
	 }
	}
  });
  add(b2);

  JButton b3=new JButton("3");
  b3.setBounds(300,110,100,55);
  b3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	 if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
		 t1.setText("3");
	 }
	 else{
		t1.setText(t1.getText()+ "3");
	 }
	}
  });
  add(b3);

  JButton b4=new JButton("4");
  b4.setBounds(80,175,100,55);
  b4.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	 if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
		t1.setText("4");
	 }
	 else{
		 t1.setText(t1.getText()+ "4");
	 }
	}
  });
  add(b4);

  JButton b5=new JButton("5");
  b5.setBounds(190,175,100,55);
  b5.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	 if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
		 t1.setText("5");
	 }
	 else{
		t1.setText(t1.getText()+ "5");
	 }
	}
  });
  add(b5);

  JButton b6=new JButton("6");
  b6.setBounds(300,175,100,55);
  b6.addActionListener(new ActionListener(){
	 public void actionPerformed(ActionEvent ae){
	  if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
		 t1.setText("6");
	 }
	 else{
		 t1.setText(t1.getText()+ "6");
	 }
	}
  });
  add(b6);

  JButton b7=new JButton("7");
  b7.setBounds(80,240,100,55);
  b7.addActionListener(new ActionListener(){
  	 public void actionPerformed(ActionEvent ae){
  	  if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
  		 t1.setText("7");
  	 }
  	 else{
  		 t1.setText(t1.getText()+ "7");
	 }
    }
   });
  add(b7);

  JButton b8=new JButton("8");
  b8.setBounds(190,240,100,55);
  b8.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
    	 t1.setText("8");
    }
    else{
    	 t1.setText(t1.getText()+ "8");
  	 }
    }
   });
  add(b8);

  JButton b9=new JButton("9");
  b9.setBounds(300,240,100,55);
  b9.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
    		t1.setText("9");
      }
    else{
    	  t1.setText(t1.getText()+ "9");
  	 }
    }
   });
  add(b9);

  JButton b10=new JButton("+");
  b10.setBounds(80,306,100,55);
  b10.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	  pnum=Double.parseDouble(t1.getText());
	  t1.setText("+");
	  op="+";
	}
  });
  add(b10);

  JButton b11=new JButton("0");
  b11.setBounds(190,306,100,55);
  b11.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
     if(t1.getText().equals("+") || t1.getText().equals("-") || t1.getText().equals("*") || t1.getText().equals("/")){
    	  t1.setText("0");
       }
    else{
    	  t1.setText(t1.getText()+ "0");
  	 }
    }
   });
  add(b11);

  JButton b12=new JButton("-");
  b12.setBounds(300,306,100,55);
  b12.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		pnum=Double.parseDouble(t1.getText());
		t1.setText("-");
		op="-";
	}
  });
  add(b12);

  JButton b13=new JButton("*");
  b13.setBounds(80,372,100,55);
  b13.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		pnum=Double.parseDouble(t1.getText());
		t1.setText("*");
	    op="*";
	}
  });
  add(b13);

  JButton b14=new JButton("/");
  b14.setBounds(190,372,100,55);
  b14.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	  pnum=Double.parseDouble(t1.getText());
	  t1.setText("/");
	  op="/";
	 }
	});
  add(b14);

  JButton b15=new JButton("=");
  b15.setBounds(300,372,100,55);
  b15.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
     num1=Double.parseDouble(t1.getText());
      if(op.equals("+")){
		 res=pnum+num1;
	 }
	 else if(op.equals("-")){
		 res=pnum-num1;
	 }
	 else if(op.equals("*")){
		 res=pnum*num1;
	 }
	 else if(op.equals("/")){
		 res=pnum/num1;
	 }
	 t1.setText(String.valueOf(res));
	}
  });
  add(b15);

  JButton b16=new JButton(".");
  b16.setBounds(140,438,100,55);
  b16.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	  t1.setText(t1.getText().concat("."));
	}
  });
  add(b16);

  JButton b17=new JButton("C");
  b17.setBounds(250,438,100,55);
  b17.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	  t1.setText("");
	}
  });
  add(b17);

  }
   public static void main(String args[]){
   SwingCalculatorEx sw=new SwingCalculatorEx();
 }
}