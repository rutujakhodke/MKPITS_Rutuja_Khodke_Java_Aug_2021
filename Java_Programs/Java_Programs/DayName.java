//1.wap to accept a day no. between 1 and 7 and then display the dayname using switch.
import java.util.*;
class DayName
{
 public static void main(String args[])
 {
	 int dayno;
	 String dayname;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter a day number :");
	 dayno=s.nextInt();

	 switch(dayno)
	 {
		 case 1:dayname="Monday";
		 break;
		 case 2:dayname="Tuesday";
		 break;
		 case 3:dayname="Wednesday";
		 break;
		 case 4:dayname="Thursday";
		 break;
		 case 5:dayname="Friday";
		 break;
		 case 6:dayname="Saturday";
		 break;
		 case 7:dayname="Sunday";
		 break;
		 default:dayname="invalid day";
		 break;
	 }
	 System.out.println("dayname :"+dayname);
	}
}