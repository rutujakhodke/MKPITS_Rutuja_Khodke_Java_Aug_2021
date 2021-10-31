//1.Java LinkedList Example.
import java.util.*;
public class TestLinkedListEx1{
 public static void main(String args[]){
 LinkedList<String> list=new LinkedList<String>();
 list.add("Anuj");
 list.add("Amit");
 list.add("Rahul");
 list.add("Nikhil");

 Iterator<String> itr=list.iterator();//traverse the linkedlist elements
  while(itr.hasNext()){
  System.out.println("Student Name ="+itr.next());
  }
 }
}