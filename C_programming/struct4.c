//4.create a structure product with members productid,productname and productprice.
struct product
{
	int prodId;
	char prodname[10];
	float prodprice;
	
};
int main()
{
	struct product p1;
	p1.prodId=101;
	strcpy(p1.prodname,"laptop");
	p1.prodprice=30,000.0f;
	
	printf("\n prodId=%d",p1.prodId);
	printf("\n prodname=%s",p1.prodname);
	printf("\n prodprice=%f",p1.prodprice);
	
}
