//12.Write a java program to read temperature in centigrade and display a suitable message
//according to temperature state below
//Temp < 0 then Freezing weather
//Temp 0-10 then Very Cold weather
//Temp 10-20 then Cold weather
//Temp 20-30 then Normal in Temp
//Temp 30-40 then Its Hot
//Temp >=40 then Its Very Hot
import java.util.*;
class ReadTemp
{
public static void main(String args[])
 {
 int temp;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a days temperature :");
  temp=s.nextInt();
  if(temp<0)
  {
	  System.out.println("freezing weather.");
  }
  else if(temp<10)
  {
	  System.out.println("very cold weather.");
  }
  else if(temp<20)
  {
	  System.out.println("cold weather.");
  }
  else if(temp<30)
  {
	  System.out.println("normal in temp.");
  }
  else if(temp<40)
  {
	  System.out.println("its hot weather.");
  }
  else
  {
	  System.out.println("its very hot weather.");
  }
}
}
