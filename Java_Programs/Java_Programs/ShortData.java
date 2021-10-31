//3.Example on short datatype.
import java.util.*;
class ShortData
{
	public static void main(String args[])
	{
		short s1=32767;
		System.out.println("short value :"+s1);
		Scanner s=new Scanner(System.in);
		System.out.println("enter a short number :");
		s1=s.nextShort();
		System.out.println("short value :"+s1);
	}
}