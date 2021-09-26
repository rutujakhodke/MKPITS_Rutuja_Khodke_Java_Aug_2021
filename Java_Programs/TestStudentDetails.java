//3.Assign and print the roll_number, phone_number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
class Student{
String name;
int roll_no;
long phone_number;
String address;
}

class TestStudentDetails{
public static void main(String[] args){
Student s1=new Student();
s1.name="Sam";
s1.roll_no=11;
s1.phone_number=8230416035l;
s1.address="Sadar Nagpur";

System.out.println(s1.name+" "+s1.roll_no+" "+s1.phone_number+" "+s1.address);

Student s2=new Student();
s2.name="John";
s2.roll_no=12;
s2.phone_number=8403654417l;
s2.address="Mahal Nagpur";

System.out.println(s2.name+" "+s2.roll_no+" "+s2.phone_number+" "+s2.address);
 }
}