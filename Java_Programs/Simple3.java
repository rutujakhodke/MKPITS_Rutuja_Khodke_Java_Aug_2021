//7.example of variables : Narrowing(typecasting)
class Simple3
{
 public static void main(String args[])
 {
	 float f=10.5f;
	 //int a=f;//error
	 int a=(int)f;//convert float into int.
	 System.out.println(f);
	 System.out.println(a);
	 }
}