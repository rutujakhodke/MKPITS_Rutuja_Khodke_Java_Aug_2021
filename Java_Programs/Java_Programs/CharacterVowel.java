//1.wap to accept a character and print whether it is vowel or not.
import java.util.*;
class CharacterVowel
{
 public static void main(String args[])
 {
	 char choice;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter any alphabet(a-z) :");
	 choice=s.next().charAt(0);

	 if(choice=='a' || choice=='e' || choice=='i' || choice=='o' || choice=='u')
	 {
		 System.out.println("character is a vowel.");
	 }
	 else
	 {
		 System.out.println("character is not vowel.");
	 }
 }
}