//11.example of method overloading with type promotion if matching found.
class OverloadingCal1{
 void sum(int a,int b){
 System.out.println("int arg method invoked.");
 }
 void sum(long a,long b){
 System.out.println("long arg method invoked.");
 }
 public static void main(String[] args){
 OverloadingCal1 o1=new OverloadingCal1();
 o1.sum(12,20);//now int arg sum() method gets invoked
 }
}