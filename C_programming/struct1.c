//1.create a structure book with members bookid,title,author and price.

struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
	
};
int main()
{
	//creating a structure variable.
	struct book b1;//b1 is structure variable
	//assigning values to structure members.
	b1.bookid=123;
	strcpy(b1.title,"java");
	strcpy(b1.author,"bill");
	b1.price=112.3f;
	 
	 //displaying the values stored in an strcture.
	 printf("\n bookid=%d",b1.bookid);
	 printf("\n title=%s",b1.title);
	 printf("\n author=%s",b1.author);
	 printf("\n price=%f",b1.price);
	 
}
