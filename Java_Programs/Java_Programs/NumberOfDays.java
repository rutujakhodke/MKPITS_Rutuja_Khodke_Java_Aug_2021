//6.wap to find number of days by accepting month and year from user
import java.util.*;
class NumberOfDays
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
     int month;
	int year;
	int numDays=0;
	System.out.println("enter a month :");
	month=s.nextInt();
	System.out.println("enter a year :");
	year=s.nextInt();

	switch(month)
	{
		case 1:case 3:case 5:
		case 7:case 8:case 10:
		case 12:
		  numDays=31;
		  break;
		case 4:case 6:
		case 9:case 11:
		  numDays=30;
		  break;
		case 2:
		  if(((year % 4==0) && !(year % 100==0)) ||(year % 400==0))
		  numDays=29;
		  	  else
		  	     numDays=28;
		  	     break;
		  	   default:
		  	     System.out.println("Invalid month");
		  	     break;
	 }
		  	 System.out.println("number of days ="+numDays);
	}
 }


