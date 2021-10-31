//3.java program to illustrate the use of static variable which is shared with all objects.
class Counter2{
 static int count=0;//will get memory only once and retain its value.

 Counter2(){
 count++;
 System.out.println(count);
 }
 public static void main(String args[]){
	 Counter2 c1=new Counter2();//1
	 Counter2 c2=new Counter2();//2
	 Counter2 c3=new Counter2();//3
	 Counter2 c4=new Counter2();//4
 }
}