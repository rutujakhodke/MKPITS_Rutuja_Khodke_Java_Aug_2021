//12.example of method overloading with type promotion in case of ambiguity.
class OverloadingCal2{
void sum(int a,long b){
 System.out.println("a method is invoked.");
 }
 void sum(long a,int b){
  System.out.println("b method is invoked.");
 }
  public static void main(String[] args){
  OverloadingCal2 o1=new OverloadingCal2();
  o1.sum(20,12);//now ambiguity compile time error
 }
 }