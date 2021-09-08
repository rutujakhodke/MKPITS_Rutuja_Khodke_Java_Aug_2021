//13.wap to create structure array of 10 elements of structure product.
struct product
{
	int prodId;
	char prodname[20];
	float prodprice;
};
void display(struct product p1);

int main()
{
	struct product p[10];
	int i=0;
	while(i<10)
	{
		printf("\n enter a prodId :");
		scanf("%d",&p[i].prodId);
		
		printf("\nenter a product name :");
		scanf("%s",&p[i].prodname);
		
		printf(" \nenter a product price :");
		scanf("%f",&p[i].prodprice);
		
		printf("\n product[%d] details are :",i+1);
		display(p[i]);//passing structure to function
		i++;
		
		printf("\n");
		
	}
}
void display(struct product p1)
{
	printf("\n prodId=%d",p1.prodId);
	printf("\n prodname=%s",p1.prodname);
	printf("\n prodprice=%f",p1.prodprice);
}

