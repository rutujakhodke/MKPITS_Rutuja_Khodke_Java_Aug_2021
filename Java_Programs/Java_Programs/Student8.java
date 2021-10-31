//12.java program to initalize the values from one object to another object.
class Student8{
 int id;
 String name;
 
 public Student8(int i,String n){
   id=i;
   name=n;
 }
 public Student8(Student8 s){
  id=s.id;
  name=s.name;
 }
 void display(){
 System.out.println(id+ " "+name);
 }
 
 public static void main(String args[]){
 Student8 s1=new Student8(112,"Ram");
 Student8 s2=new Student8(s1);
 
 s1.display();
 s2.display();
}
}