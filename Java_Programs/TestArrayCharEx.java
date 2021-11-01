//5.Wap to create an char array of 5 elements to store 5 characters and accept the 5 characters from user then display the characters stored in an array in Java.(using for each loop)
import java.util.*;
public class TestArrayCharEx{
  public static void main(String[] args){
  char ch[]=new char[5];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<5;i++){
	 System.out.println("Enter a Character:");
	 ch[i]=scan.next().charAt(0);
  }
  //displaying the character elements
  System.out.println();
  for(char i:ch){
	 System.out.println(i);
  }
 }
}