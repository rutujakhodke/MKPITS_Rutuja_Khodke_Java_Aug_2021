//now create another class name i.e class B of different package.
package mypack;
import pack.*;
class B{
 public static void main(String args[]){
 A obj=new A();//creating object of class A.
 obj.msg();
 }
}