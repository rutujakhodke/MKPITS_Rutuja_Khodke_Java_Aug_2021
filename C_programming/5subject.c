//9.wap to accept 5 subject marks and print total and average marks.
int main()
{
	int m1,m2,m3,m4,m5;
	float total,average;
	printf("enter a first subject marks :");
	scanf("%d",&m1);
	printf("\nenter a second subject marks :");
	scanf("%d",&m2);
	printf("\nenter a third subject marks :");
	scanf("%d",&m3);
	printf("\nenter a fourth subject marks :");
	scanf("%d",&m4);
	printf("\nenter a fifth subject marks :");
	scanf("%d",&m5);
	total=m1+m2+m3+m4+m5;
	printf("\n total of 5 subject marks =%f",total);
	average=total/5.0f;
	printf("\n average marks =%f",average);
}
