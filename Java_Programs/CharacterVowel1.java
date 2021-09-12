//2.wap to accept a character and print whether it is vowel or not.
import java.util.*;
class CharacterVowel1
{
 public static void main(String args[])
 {
	 char choice;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a character (a-z) :");
  choice=s.next().charAt(0);

  if(choice=='a')
  {
	  System.out.println("char is vowel");
  }
  else if(choice=='e')
  {
	  System.out.println("char is vowel");
  }
  else if(choice=='i')
  {
	  System.out.println("char is vowel");
  }
  else if(choice=='o')
    {
  	  System.out.println("char is vowel");
    }
  else if(choice=='u')
	{
	  System.out.println("char is vowel");
     }
     else
     {
		 System.out.println("char is not vowel");
	 }

   }
}