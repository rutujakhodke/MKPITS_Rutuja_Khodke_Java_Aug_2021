//6.wap to accept 3 subject marks and print total,per and grade.

int main()
{
	int eng,phy,chem;//3 subject marks.
	float total,per;
	
	printf("Enter 3 subject marks : \n");
	scanf("%d%d%d",&eng,&phy,&chem);
	 
	total=eng+phy+chem;
	printf("\ntotal marks=%f",total);
	
	per=(float)(total/300.0f)*100.0f;
	printf("\n percentage=%f",per); 
	
	if(per>75)
	{
		printf("\n grade=distinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\ngrade=first");
	}
	else
	{
		printf("\ngrade=fail");
	}
	
	
}																							
