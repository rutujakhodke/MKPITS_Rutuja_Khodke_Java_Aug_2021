//11.java program to overload constructors.
class Student7{
 int id;
 String name;
 int age;
 //creating 2 arg constructor.
 Student7(int i,String n){
  id=i;
  name=n;
 }
 //creating 3 arg constructor.
 Student7(int i,String n,int a){
  id=i;
  name=n;
  age=a;
 }
 //creating 1 arg constructor.
 Student7(int a){
  age=a;
 }
 //creating default constructor.
 Student7(){
 System.out.println("Default constructor is called.");
 id=112;
 name="Raj";
 age=18;
 }
 //creating method display.
 public void display(){
  System.out.println(id+" "+name+" "+age);
 }

  public static void main(String args[]){
  Student7 s1=new Student7(112,"Arjun");
  Student7 s2=new Student7(113,"Ajit",19);
  Student7 s3=new Student7(20);
  Student7 s4=new Student7();

  s1.display();
  s2.display();
  s3.display();
  s4.display();
}
}