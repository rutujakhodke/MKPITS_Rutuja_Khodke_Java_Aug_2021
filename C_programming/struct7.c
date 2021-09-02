//7.create a structure product and accept values from the user.
struct product
{
	int prodId;
	char prodname[20];
	float prodprice;
	
};
int main()
{
	struct product p1;
	printf("enter prodId :");
	scanf("%d",&p1.prodId);
	
	printf(" enter a prodname :");
	scanf("%s",&p1.prodname);
	
	printf("enter a prodprice :");
	scanf("%f",&p1.prodprice);
	
	printf("\n product details are :");
	printf("\n prodId=%d",p1.prodId);//displaying the employee details.
	printf("\n prodname=%s",p1.prodname);
	printf("\n prodprice=%f",p1.prodprice);
	
}
	
	
	
	
	
