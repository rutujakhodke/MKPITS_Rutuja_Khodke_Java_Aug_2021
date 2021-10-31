//9.java program to demonstrate the use of Parametrized constructor.
class Student5{
 int id;
 String name;
 //creating a parametrized constructor.
 public Student5(int i,String n){
	 id=i;
	 name=n;
 }
 //method to display the values.
 void display(){
	 System.out.println("Student id is ="+id);
	 System.out.println("Student name is ="+name);
  }
	 public static void main(String args[]){
		Student5 s1=new Student5(111,"Karan");
		Student5 s2=new Student5(222,"Aryan");
		s1.display();
		s2.display();
	 }
	 }
