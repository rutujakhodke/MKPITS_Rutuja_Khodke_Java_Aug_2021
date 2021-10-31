//13.Java ArrayList Example.isEmpty() method.
import java.util.*;
public class TestArrayListEx16{
 public static void main(String args[]){
 ArrayList<String> list=new ArrayList<String>();
 System.out.println("Is ArrayList Empty :"+list.isEmpty());
 list.add("Anuj");
 list.add("Manit");
 list.add("Ajit");
 System.out.println("After insertion the elements");
 System.out.println("Is ArrayList Empty :"+list.isEmpty());
 }
}