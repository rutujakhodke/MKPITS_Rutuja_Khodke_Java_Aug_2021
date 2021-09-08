//7.create a union customer with member custid(int),custname(char array),mobileno(double).
union customer
{
	int custId;
	char custname[20];
	double mobileno;
};
int main()
{
	union customer c1;
	//accepting values from user
	printf("\n enter a customer id :");
	scanf("%d",&c1.custId);
	
	printf("\n enter a customer name :");
	scanf("%s",&c1.custname);
	
	printf("\n enter a customer mobileno :");
	scanf("%lf",&c1.mobileno);
	
	//displaying the values.
	printf("\n custId=%d",c1.custId);
	printf("\n custname=%s",c1.custname);
	printf("\n mobileno=%Lf",c1.mobileno);
	
	printf("\n custname=%s",c1.custname);//will not print anything
}
