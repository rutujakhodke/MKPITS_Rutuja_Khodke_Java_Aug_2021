//9.wap to accept length,breadth and height and then print volume.
import java.util.*;
class Volume
{
public static void main(String args[])
{
	int length,breadth,height;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a length :");
	length=s.nextInt();
	System.out.println("enter a breadth :");
	breadth=s.nextInt();
	System.out.println("enter a height :");
	height=s.nextInt();
	int volume=length*breadth*height;
	System.out.println("Volume ="+volume);
}
}