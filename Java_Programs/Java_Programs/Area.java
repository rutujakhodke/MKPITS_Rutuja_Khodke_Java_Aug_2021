//8.wap to accept length and breadth of rectangle and then print area of rectangle.
import java.util.*;
class Area
{
	public static void main(String args[])
	{
		int length,breadth;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a length and breadth of a rectangle :");
		length=s.nextInt();
		breadth=s.nextInt();
		int area=length*breadth;
		System.out.println("area of a rectangle ="+area);
	}
}