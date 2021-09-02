//2.declaring union variables inside main function.
union data
{
	int i;
	float j;
	char name[30];
	
};
int main()
{
	union data d1;//declaring union variable d1  inside main function.
	
	d1.i=10;
	printf("\n value of i=%d",d1.i);
	d1.j=13.5f;
	printf("\n value of j=%f",d1.j);
	strcpy(d1.name,"miller");
	printf("\n name=%s",d1.name);
	printf("\n now value of i=%d",d1.i);
}

