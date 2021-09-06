//10.wap to accept age of 5 students using for loop and then display the average age.
int main()
{
	int age,total;
	int i;
	float average;
	for(i=1;i<=5;i++)
	{
		printf("enter a age of student :");
		scanf("%d",&age);
		total=total+age;
		
	}
	average=(float)total/5.0f;
	printf("\n average age of student =%f",average);
}
