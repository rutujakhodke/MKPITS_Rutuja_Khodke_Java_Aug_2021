//1.Example on local variables.
import java.util.*;
class VariableLocal
{
 public static void main(String args[])
 {

	 //System.out.println("num ="+num);//error since num variable is local in display method.
	 display();

  }
    static void display()
  {
	  int num=10;
	  System.out.println("num ="+num);

  }
}