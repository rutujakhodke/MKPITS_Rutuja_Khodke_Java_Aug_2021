//1.create a package mkpits1 and in it create a class Result having method to calculate total,percentage and grade.
package mkpits1;
public class Result{
 int phy,chem,bio;
 int total;
 float per;
 String grade;

 public int calculateTotal(int m1,int m2,int m3){
  phy=m1;
  chem=m2; 
  bio=m3;
  total=phy+chem+bio;
  return total;
}

 public float calculatePercentage(){
  per=(float)(total/300.0f)*100.0f;
  return per;
}

 public String calculateGrade(){
   if(per>=75)
   grade="Distinction";
   else if(per>=60 && per<75)
   grade="First";
   else
   grade="Fail";
  return grade;
 }
 
}  