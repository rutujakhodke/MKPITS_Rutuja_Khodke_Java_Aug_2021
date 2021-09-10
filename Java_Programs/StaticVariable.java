//4.Example on static variable.
class StaticVariable
{
	static int num;//static variable
	public static void main(String args[])
	{
		num=20;
		System.out.println("num ="+num);//20
		StaticVariable s1=new StaticVariable();//s1 is a instance of class StaticVariable.
		s1.num=40;
		System.out.println("num of s1 =" +s1.num);//40

		StaticVariable s2=new StaticVariable();//s1 is a instance of class StaticVariable.
		System.out.println("num of s2 ="+s2.num);//40


	}

}