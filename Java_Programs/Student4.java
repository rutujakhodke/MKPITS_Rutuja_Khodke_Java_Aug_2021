//6.wap of java of default constructor that displays the default values.
class Student4{
 int id;
 String name;
 //method to display the value of id and name.
 void display(){
  System.out.println(id+" "+name);
 }
 public static void main(String args[]){
 //creating objects.
 Student4 s1=new Student4();
 Student4 s2=new Student4();
 //displaying the values of a object.
 s1.display();
 s2.display();
}
}