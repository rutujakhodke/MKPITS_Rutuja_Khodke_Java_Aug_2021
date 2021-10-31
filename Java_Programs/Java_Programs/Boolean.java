//1.Example of boolean type.
import java.util.*;
class Boolean
{
	public static void main(String[] args)
	{
		boolean b1=false;
		System.out.println("boolean value :"+b1);
		Scanner s=new Scanner(System.in);
		System.out.println("enter a true or false :");
		b1=s.nextBoolean();
		System.out.println("Boolean value :"+b1);
	}
}