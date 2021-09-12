//3.wap  to accept a character and print whether it is vowel or not using switch case.
import java.util.*;
class CharacterVowel2
{
 public static void main(String args[])
 {
	 char choice;
 Scanner s=new Scanner(System.in);
 System.out.println("enter a character (a-z) :");
 choice=s.next().charAt(0);

 switch(choice)
 {
	 case 'a':
	 case 'e':
	 case 'i':
	 case 'o':
	 case 'u':
	   System.out.println("char is vowel.");
	   break;
	 default:
	    System.out.println("char is not vowel.");
	    break;
  }
  }
}