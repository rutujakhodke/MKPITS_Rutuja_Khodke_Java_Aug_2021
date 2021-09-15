//10.wap in java to create a class student by using constructor overloading.
class Student6{
 int id;
 String name;

 //creating parametrized constructor.
 public Student6(int i){
   id=i;
 }
 //constructor overloading.
 public Student6(int i,String n){
   id=i;
   name=n;
 }
 void display(){
 System.out.println(id+"  "+name);
 }

  public static void main(String args[]){
  Student6 s1=new Student6(112);
  Student6 s2=new Student6(113,"Raj");
  //calling the method to display the values of object.

  s1.display();
  s2.display();
}
}