//4.wap to print even no. from 1 to 10 using for loop.
class ForEven1To10
{
  public static void main(String args[])
  {
  int i,num=10;
  System.out.println("even numbers from 1 to "+num+"are : ");
  for(i=1;i<=10;i++)
  {
   if(i % 2 ==0)
   {
    System.out.println(i+ " ");
   }
  }
  }
}