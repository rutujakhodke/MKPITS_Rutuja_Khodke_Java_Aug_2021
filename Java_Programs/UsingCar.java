//1.wap to create a class car having fields modelno,color,make and methods start ,stop.
class Car//sub class
{
 String model;//variables
 String color;

 public void start()
 {
  System.out.println("car is started.");
 }

  public void stop()
 {
  System.out.println("car is stopped.");
 }

}
class UsingCar//main class
{
 public static void main(String args[])
 {
 Car c1=new Car();//object creation
 c1.model="Alto";//calling the variables of sub class by using object.
 c1.color="Black";
 System.out.println("model ="+c1.model);
 System.out.println("color ="+c1.color);
 //method calling
 c1.start();
 c1.stop();
 }
}
