//9.example of static block.
class A3{
 static int num;
 static{
  System.out.println("Static block is invoked.");
  num=1;
 }
 public static void main(String args[]){
 System.out.println("Hello main.");
 System.out.println("Number is ="+num);
}
}