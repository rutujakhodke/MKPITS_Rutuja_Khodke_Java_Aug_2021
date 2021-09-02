//4.wap to displaying corrupted values of i and j.
union data
{
	int i;
	float j;
	char name[10];
	
};
int main()
{
	union data d1;
	
	printf("\n memory occupied by data =%d bytes",sizeof(d1));
	d1.i=10;
	//printf("\n value of i=%d",d1.i);
	d1.j=13.7f;
	//printf("\n value of j=%d",d1.j);
	strcpy(d1.name,"miller");
	
	printf("\n value of i=%d",d1.i);//displaying corrupted values of i and j.
	printf("\n value of j=%d",d1.j);
	printf("\n name=%s",d1.name);
	
}
