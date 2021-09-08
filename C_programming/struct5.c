//5.create a structure book and create 2 structure variable b1 and b2.
struct book
{
	int bookId;
	char title[20];
	char author[20];
	float price;
	
};
int main()
{
	//creating a structure variable.
	struct book b1,b2;//b1 is structure variable
	//assigning values to structure members.
	b1.bookId=123;
	strcpy(b1.title,"java");
	strcpy(b1.author,"bill");
	b1.price=112.3f;
	 
	 //displaying the values stored in an strcture.
	 printf("\n book 1 details :");
	 printf("\n bookId=%d",b1.bookId);
	 printf("\n title=%s",b1.title);
	 printf("\n author=%s",b1.author);
	 printf("\n price=%f",b1.price);
	 
	 printf("\n");
     printf("\n book 2 details :");
	 b1.bookId=124;
	strcpy(b1.title,"python");
	strcpy(b1.author,"scott");
	b1.price=120.4f;
	 
	 //displaying the values stored in an strcture.
	 printf("\n bookId=%d",b1.bookId);
	 printf("\n title=%s",b1.title);
	 printf("\n author=%s",b1.author);
	 printf("\n price=%f",b1.price);
}
