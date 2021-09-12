//13.example on continue statement.
class Test1
{
 public static void main(String args[])
 {
	 int num[]={1,2,3,4,5};
	 for(int n:num)
	 {
		 if(n==3)
		 {
			 continue;
		 }
		 System.out.println("count is ="+n);
	 }
  }
}