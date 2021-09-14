//5.wap to print odd no. from 1 to 10 using for loop.
class ForOddNo
{
 public static void main(String args[])
 {
 int num,n=10;
 System.out.println("odd numbers from 1 to "+n+" are :");
 for(num=1;num<=10;num++)
 {
  if(num % 2 ==1)
  {
  System.out.println(num+ " ");
  }
 }
 }
}