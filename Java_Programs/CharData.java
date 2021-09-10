//7.Example on char datatype.
import java.util.*;
class CharData
{
	public static void main(String[] args)
	{
		char c1='R';
		System.out.println("char value :"+c1);
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character :");
		c1=s.next().charAt(0);
		System.out.println("char value :"+c1);
	}
}