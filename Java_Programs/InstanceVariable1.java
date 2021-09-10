//3.Example on Instance variable.
class InstanceVariable1
{
	int num;//instance variable
	public static void main(String args[])
	{
		//creating instance object of InstanceVariable1 class
		InstanceVariable1 i1=new InstanceVariable1();
		i1.num=5;
		System.out.println("number stored in i1 instance variable ="+i1.num);
		InstanceVariable1 i2=new InstanceVariable1();
		i2.num=7;
		System.out.println("number stored in i2 instance variable ="+i2.num);
	}


}