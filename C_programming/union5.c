//5.wap of union by accepting values from the user.
union data
{
	int i;
	float j;
	char name[10];
	
};
int main()
{
	union data d1;
	//accepting values from user
	printf("\n enter a value of i(int value) :");
	scanf("%d",&d1.i);
	
    printf("\n enter a value of j(float value) :");
	scanf("%f",&d1.j);
	
	printf("\n enter a name :");
	scanf("%s",&d1.name);

    //displaying the values.
    printf("\n value of i=%d",d1.i);
    printf("\n value of j=%f",d1.j);
    printf("\n name=%s",d1.name);
}
