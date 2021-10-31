//2.java program to demonstrate the use of an instance vaiable.
//which get memory each time when we create an object.
class Counter{
int count=0;//will get memory each time when instance is created.

Counter(){
 count++;//incrementing value.
 System.out.println(count);
 }

  public static void main(String args[]){
	 //creating objects.
	Counter c1=new Counter();//1
	Counter c2=new Counter();//1
	Counter c3=new Counter();//1
 }
}