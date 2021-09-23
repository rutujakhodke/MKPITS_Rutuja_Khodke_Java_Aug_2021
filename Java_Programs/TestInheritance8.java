//10.create a Person class,then create a Student class inhertited from Person class,then create a PartTimeStudent class inherited from Student class.
class Person{
 String name;
 String address;
 
void insertPersonData(String name,String address){
 this.name=name;
 this.address=address;
 }
void displayPersonData(){
 System.out.println(name+" "+address);
 }
}
class Studen extends Person{
 int rno;
 int marks;
 
void insertStudentData(int rno,int marks){
 this.rno=rno;
 this.marks=marks;
 } 
 void displayStudentData(){
 System.out.println(rno+" "+marks);
 }
}
class PartTimeStudent extends Student{
 int hours;
 
void insertPartTimeStudentData(int hours){
 this.hours=hours;
 }
void displayPartTimeStudentData(){
System.out.println("College Hours of Student is ="+hours);
 }
}
class TestInheritance8{
public static void main(String args[]){
PartTimeStudent s1=new PartTimeStudent();
s1.insertPersonData("Amit Kumar","Nagpur");
s1.displayPersonData();

s1.insertStudentData(15,90);
s1.displayStudentData();

s1.insertPartTimeStudentData(4);
s1.displayPartTimeStudentData();
 }
}