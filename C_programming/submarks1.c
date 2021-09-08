//5.wap to accept 3 subject marks then calculate total,percentage and grade.
int main()
{
	int s1,s2,s3,total;
	float percentage;
	
	printf("enter a 3 subject marks :");
	scanf("%d%d%d",&s1,&s2,&s3);
	 total=s1+s2+s3;
	 printf("\n total marks =%d",total);
	 percentage=(float)(total/300.0f)*100.0f;
	 printf("\n percentage =%f",percentage);
	 
	 if(percentage>=75)
	 {
	 	printf("\n grade=distinction");
	 }
	 else if(percentage>=60 && percentage<75)
	 {
	 	printf("\n grade=first");
	 }
	 else if(percentage>=45 && percentage<60)
	 {
	 	printf("\n grade=second");
	 }
	 else
	 {
	 		printf("\n grade=fail");
	 }
	 return 0;
}
