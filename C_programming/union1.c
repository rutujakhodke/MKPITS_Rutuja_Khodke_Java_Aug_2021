//1.create a union data with 3 members (int i,float j,char n[10]).
union data
{
	int i;
	float j;
	char name[20];
}d1;//create variable d1 of data of type union.

int main()
{
	d1.i=12;
	printf("\n value of i=%d",d1.i);
	d1.j=120.3f;
	printf("\n value of j=%f",d1.j);
	strcpy(d1.name,"amit");
	printf("\n value of name=%s",d1.name);
   	printf("\n now value of i=%d",d1.i);//it will print garbage value.
	printf("\n  now value of j=%f",d1.j);
}
