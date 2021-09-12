//12.example on for loop.
class IterationEx
{
 public static void main(String args[])
 {
	 int num[]={1,2,3,4,5,6,7,8,9,10,11};//array of 11 elements.
	 //enhanced for loop for each loop.
	 for(int item:num)//item=num
	 {
		 System.out.println("count is ="+item);
		 if(item==3)
		 {
			 break;
		 }
	 }
  }
}