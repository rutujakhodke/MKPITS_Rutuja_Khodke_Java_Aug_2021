//8.Java runtime polymorphism with datamember.
class Bike{
 int speedLimit=90;
}
class Honda extends Bike{
 int speedLimit=110;
}
class TestRunTimePoly8{
public static void main(String args[]){
Bike b=new Honda();
//it will call parent class datamember
System.out.println(b.speedLimit);//90
 }
}