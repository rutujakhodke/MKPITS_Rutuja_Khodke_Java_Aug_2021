//1.Java Collection Observable Example.addObserver() method.
import java.util.*;
class Observer1 implements Observer{
 public void update(Observable obj,Object arg){
  System.out.println("Observer1 is added");
 }
}
 //this class being observed
 class BeingObserved extends Observable{
  void incre(){
   setChanged();
   notifyObservers();
  }
 }
 class ObserverDemo{
 //driver method of the program
  public static void main(String args[]){
  BeingObserved beingObserved =new BeingObserved();
  Observer1 observer1=new Observer1();
  beingObserved.addObserver(observer1);
  beingObserved.incre();
 }
}