//13.write a java program to check whether a character is an alphabet,digit or special character.
import java.util.*;
class CharacterCheck
{
public static void main(String args[])
{
	char ch;
 Scanner s=new Scanner(System.in);
 System.out.println("enter a character :");
 ch=s.next().charAt(0);
  if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
  {
	  System.out.println("character is an alphabet."+ch );
  }
  else if(ch>='0' && ch<='9')
  {
	   System.out.println("character is an digit."+ch );
  }
  else
  {
	   System.out.println("is an special character."+ch );
  }

 }
}