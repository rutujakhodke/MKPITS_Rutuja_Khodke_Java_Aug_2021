//12.wap to print a fibonacci series.(1,1,2,3,5,8,13).
class FibonacciSeries
{
  public static void main(String args[])
  {
	int i=1,firstterm=0,secondterm=1,nextterm;
	int num=10;
	System.out.println("fibonacci series till "+ num +" terms :");

	while(i<=num)
	{
		System.out.println(firstterm + ", ");
		 nextterm=firstterm+secondterm;
		 firstterm=secondterm;
		 secondterm=nextterm;
		 i++;
	}
 }
}