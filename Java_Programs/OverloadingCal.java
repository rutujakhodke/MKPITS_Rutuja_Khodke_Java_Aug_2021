//10.Method overloading with type promotion
class OverloadingCal{
void sum(int a,long b){
System.out.println(a+b);
 }
 void sum(int a,int b,int c){
 System.out.println(a+b+c);
 }
 public static void main(String[] args){
 OverloadingCal o1=new OverloadingCal();
 o1.sum(20,20);//now second int literal will be promoted to long
 o1.sum(20,20,20);
 }
}