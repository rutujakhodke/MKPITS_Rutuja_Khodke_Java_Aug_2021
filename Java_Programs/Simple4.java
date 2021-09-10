//8.example of variables : overflow
class Simple4
{
 public static void main(String args[])
 {
	 //overflow
	 int a=130;
	 byte b=(byte)a;
	 System.out.println(a);//130
	 System.out.println(b);//-126
  }
}