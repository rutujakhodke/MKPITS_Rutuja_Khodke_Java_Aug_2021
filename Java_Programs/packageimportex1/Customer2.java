//6.example of package by using fully qualified name.
package bank;

class Customer2{
 public static void main(String args[]){
//fully qualified naming.

sbi.Account act=new sbi.Account();
String str=act.deposit(500);
System.out.println(str);
 }
}