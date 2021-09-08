//3.create a program to accept 3 subject marks in an array and then pass this array to function calculate_result to calculate total , percentage and grade.

int main()
{
	int marks[3],i;
	for(i=0;i<3;i++)
	{
	//accept the 3 subject marks from user.
	
		printf(" enter a 3 subject marks");
		scanf("%d",&marks[i]);
	}
	calculate_result(marks);
	
}
void calculate_result(int marks[])
{
    int total=0,i;//we take total=0 as a default value.
	float per;
	  for(i=0;i<3;i++)
	  {
	  	total = total + marks[i];
	  }
	  printf("\n total marks = %d",total);//print total marks.
	  per = (float) (total/300.0f)* 100.0f;
	  printf("\n percentage = %f",per);//print percentage
	  //determine grade by using if-else.
	  if(per>=75){
	  	printf("\n grade= A");
	  }
	  else if(per>=60 && per<75){
	  	printf("\n grade= B");
	  }
	  else{
	  	printf("\n fail");
	  }
	  	
}
	  
	

